/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.AccountDAO;
import entity.Account;
import entity.Student;
import gui.Main;
import gui.SignIn;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import util.Effect;
import util.FormController;

/**
 *
 * @author Trần Việt
 */
public class AccountBO {

    AccountDAO accountDAO = new AccountDAO();
    Effect effect = new Effect();
    FormController open = new FormController();

    /**
     *
     * @param frame
     * @param userName
     * @param password
     */
    public void Login(JFrame frame, String userName, String password) {
        Account temp = accountDAO.login(userName, password);
        effect.LoadingMouse(frame, false);
        if (temp == null) {
            JOptionPane.showMessageDialog(frame, "This account doesn't exist\nPlease enter again!!!");

        } else {
            JOptionPane.showMessageDialog(frame, "Welcome back " + ((temp.getType() == 0) ? "Viet" : ((temp.getType() == 1) ? "Teacher" : temp.getUserName())));
            open.show(new Main(temp));
            frame.dispose();
        }
    }

    /**
     *
     * @param frame
     * @param isDark
     * @param userName
     * @param PIN
     */
    public void GetPass(JFrame frame, boolean isDark, String userName, String PIN) {
        Account temp = accountDAO.forgotPass(userName, PIN);
        effect.LoadingMouse(frame, false);
        if (temp == null) {
            JOptionPane.showMessageDialog(frame, "Sorry!! Wrong username or PIN\nPlease enter again!!!");
        } else {
            JOptionPane.showMessageDialog(frame, "Your Password is " + temp.getPassword());
            frame.dispose();
            new FormController().show(new SignIn(isDark));
        }
    }

    /**
     *
     * @param frame
     * @param isDark
     * @param userName
     * @param pass
     * @param rePass
     * @param question
     */
    public void SignUp(JFrame frame, boolean isDark, JTextField userName, JPasswordField pass, JPasswordField rePass, JTextField question) {
        Account temp = NewAccount(frame, userName, pass, rePass, question);
        if (temp == null) {
            return;
        }
        if (accountDAO.isDuplicate(temp.getUserName())) {
            JOptionPane.showMessageDialog(frame, "Username already exist");
            return;
        }
        if (accountDAO.add(temp)) {
            JOptionPane.showMessageDialog(frame, "SignUp success!!");
            frame.dispose();
            new FormController().show(new SignIn(isDark));
        } else {
            JOptionPane.showMessageDialog(frame, "SignUp Failed!!");
        }

    }

    public Account NewAccount(JFrame frame, JTextField userName, JPasswordField pass, JPasswordField rePass, JTextField question) {
        if (userName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Username cann't be empty");
            return null;
        }
        if (pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Password cann't be empty");
            return null;
        }
        if (!pass.getText().equals(rePass.getText())) {
            JOptionPane.showMessageDialog(frame, "Re-Enter Password");
            return null;
        }
        if (question.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "PIN cann't be empty");
            return null;
        }
        return new Account(0, userName.getText(), pass.getText(), 3, question.getText(), true);
    }

    public List<Account> showAcc(JTable table) {
        List<Account> listAcc = accountDAO.getAll();
        displayListAccount(table, listAcc);
        return listAcc;
    }
    
    public List<Account> Listed(int type,List<Account> list){
        List<Account> listAcc = new ArrayList<>();
        for (Account account : list) {
            if(account.getType() == type){
                listAcc.add(account);
            }
        }
        return listAcc;
    }
    public List<Account> Search(String user,List<Account> list){
        List<Account> listAcc = new ArrayList<>();
        for (Account account : list) {
            if(account.getUserName().toLowerCase().contains(user.toLowerCase().trim())){
                listAcc.add(account);
            }
        }
        return listAcc;
    }

    public void countAcc(List<Account> list, JLabel... jlb) {
        int admin = 0, student = 0, teacher = 0, outSide = 0;
        for (Account account : list) {
            switch (account.getType()) {
                case 0:
                    admin++;
                    break;
                case 1:
                    teacher++;
                    break;
                case 2:
                    student++;
                    break;
                default:
                    outSide++;
                    break;
            }
        }
        jlb[0].setText("Total: " + list.size());
        jlb[1].setText("Admin: " + admin);
        jlb[2].setText("Teacher: " + teacher);
        jlb[3].setText("Student: " + student);
        jlb[4].setText("User: " + outSide);
    }

    
    public void displayListAccount(JTable table, List<Account> list) {
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        Object[] rowData = new Object[6];
        int stt = 0;
        for (Account account : list) {
            rowData[0] = " " + ++stt;
            rowData[1] = " " + account.getUserName();
            rowData[2] = " " + account.getPassword();
            rowData[3] = " " + account.getQuestion();
            rowData[4] = " " + (account.getType() == 0 ? "admin" : (account.getType() == 1 ? "teacher" : "student"));
            rowData[5] = " " + (account.isStatus() ? "Tồn tại" : "Đã Xóa/Bị Ban");

            ((DefaultTableModel) table.getModel()).addRow(rowData);
        }
    }
}
