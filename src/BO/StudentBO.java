/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.AccountDAO;
import DAO.StudentDAO;
import entity.Account;
import entity.Student;
import gui.dialog.StudentInfor;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import util.ColorForm;
import util.FormController;

/**
 *
 * @author Trần Việt
 */
public class StudentBO {

    FormController controller = new FormController();
    ColorForm color = new ColorForm();
    AccountDAO accountDAO = new AccountDAO();
    StudentDAO studentDAO = new StudentDAO();

    /**
     * Xóa tồn tại 1 student và quyền truy cập
     *
     * @param roll
     */
    public void deleteStudent(String roll) {
        accountDAO.delete(roll);
        studentDAO.delete(roll);
    }

    /**
     *
     * @param student
     */
    public void addStudent(Student student) {
        accountDAO.add(new Account(0, student.getRoll(), "123456", 2, "123456", true));
        studentDAO.add(student);
    }

    /**
     *
     * @param dialog
     * @param jTextArea1
     * @param jrdMale
     * @param list
     */
    public void prepapeAdd(JDialog dialog, JTextArea jTextArea1, JRadioButton jrdMale, JTextField... list) {

        if (list[1].getText().isEmpty()) {
            color.WrongJTextFierd(list[1]);
            list[1].requestFocus();
            return;
        }
        if (list[2].getText().isEmpty()) {
            color.WrongJTextFierd(list[2]);
            list[2].requestFocus();
            return;
        }
        if (list[3].getText().isEmpty()) {
            color.WrongJTextFierd(list[3]);
            list[3].requestFocus();
            return;
        }
        if (jTextArea1.getText().isEmpty()) {
            color.WrongJTextArea(jTextArea1);
            jTextArea1.requestFocus();
            return;
        }

        if (JOptionPane.showConfirmDialog(dialog, "Add new Student", "Add Student",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new StudentBO().addStudent(new Student(0, list[0].getText(), list[1].getText(), jrdMale.isSelected(),
                    list[2].getText(), jTextArea1.getText(), true, 1, false, list[3].getText()));
            dialog.dispose();
        } else {
            dialog.dispose();
        }
    }

    public void updateStudent(JFrame frame, WindowAdapter getAction,Account stu,List<Student> list,int index) {
        if(stu.getType()!=0){
            JOptionPane.showMessageDialog(frame, "Sory!!You cann't change data!!","Warnning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (index < 0) {
            JOptionPane.showMessageDialog(frame, "Sory!!You have to choose the Student", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else {
            StudentInfor student = new StudentInfor(frame, true, list.get(index), true);
            student.addWindowListener(getAction);
            controller.show(student);
        }
    }
    
    public void deleteStudent(JFrame frame,Account stu,List<Student> list,JTable jtbStudent,int index){
        
        if(stu.getType()!=0){
            JOptionPane.showMessageDialog(frame, "Sory!!You cann't change data!!","Warnning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (index < 0) {
            JOptionPane.showMessageDialog(frame, "Sory!!You have to choose the Student", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame, "Ok!!", "Warnning", JOptionPane.WARNING_MESSAGE);
            Student student = list.remove(index);
            deleteStudent(student.getRoll().trim());
            displayListStudent(jtbStudent, list);
        }
    }

    /**
     * Hiển thị tất cả học sinh theo giới tính
     *
     * @param table
     * @param listUse
     * @param isMale
     * @return list result
     */
    public List<Student> showGender(JTable table, List<Student> listUse, boolean isMale) {
        List<Student> list = new ArrayList<>();
        for (Student student : listUse) {
            if (isMale == student.isGender()) {
                list.add(student);
            }
        }
        displayListStudent(table, list);
        return list;
    }

    /**
     * Hiển thị tất cả học sinh đang học hoặc nghỉ
     *
     * @param table
     * @param listUse
     * @param isstudy
     * @return
     */
    public List<Student> showStudy(JTable table, List<Student> listUse, boolean isstudy) {
        List<Student> list = new ArrayList<>();
        for (Student student : listUse) {
            if (isstudy == student.isStatus()) {
                list.add(student);
            }
        }
        displayListStudent(table, list);
        return list;
    }

    /**
     * Đếm số lượng nam nữ / đang học or nghỉ
     *
     * @param list
     * @param listLabel
     */
    public void count(List<Student> list, JLabel... listLabel) {
        int male = 0;
        int female = 0;
        int study = 0;
        int notstudy = 0;
        for (Student student : list) {
            if (student.isGender()) {
                male++;
            } else {
                female++;
            }
            if (student.isStatus()) {
                study++;
            } else {
                notstudy++;
            }
        }
        listLabel[0].setText("Total: " + list.size());
        listLabel[1].setText("Male: " + male);
        listLabel[2].setText("Female: " + female);
        listLabel[3].setText("Study: " + study);
        listLabel[4].setText("Not study: " + notstudy);
    }

    /**
     * Tìm kiếm học sinh theo loại
     *
     * @param list
     * @param search
     * @param searchBy
     * @return list result
     */
    public List<Student> searchStudent(List<Student> list, int search, String searchBy) {
        List<Student> ListUse = new ArrayList<>();
        for (Student student : list) {
            switch (search) {
                case 0:
                    if (student.getRoll().toUpperCase().contains(searchBy.toUpperCase())) {
                        ListUse.add(student);
                    }
                    break;
                case 1:
                    if (student.getName().toUpperCase().contains(searchBy.toUpperCase())) {
                        ListUse.add(student);
                    }
                    break;
                case 2:
                    if (student.getDate().toUpperCase().contains(searchBy.toUpperCase())) {
                        ListUse.add(student);
                    }
                    break;
                case 3:
                    if (student.getAddress().toUpperCase().contains(searchBy.toUpperCase())) {
                        ListUse.add(student);
                    }
                    break;
                case 4:
                    if (student.getSesion() == Integer.valueOf(searchBy)) {
                        ListUse.add(student);
                    }
                    break;
            }
        }
        return ListUse;
    }

    public List<Student> showList(JTable jtbStudent){
        List<Student> listStu = new StudentDAO().getAll();
        displayListStudent(jtbStudent, listStu);
        return listStu;
    }
    /**
     * Show the list to the table
     *
     * @param table
     * @param list
     */
    public void displayListStudent(JTable table, List<Student> list) {
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        Object[] rowData = new Object[8];
        int stt = 0;
        for (Student student : list) {
            rowData[0] = "  " + ++stt;
            rowData[1] = " " + student.getRoll();
            rowData[2] = " " + student.getName();
            rowData[3] = " " + (student.isGender() ? "nam" : "nữ");
            rowData[4] = " " + student.getDate();
            rowData[5] = " " + student.getAddress();
            rowData[6] = " " + student.getSesion();
            rowData[7] = " " + (student.isStatus() ? "Đang học" : "Tạm Dừng");

            ((DefaultTableModel) table.getModel()).addRow(rowData);
        }
    }
}
