/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import BO.AccountBO;
import DAO.AccountDAO;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Trần Việt
 */
public class FormController {
    public void show(Component c){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace(System.out);
        }
        
        java.awt.EventQueue.invokeLater(()->c.setVisible(true));
    }
    
    public void changePanel(JPanel table,JPanel option,String panel){
        CardLayout card = (CardLayout) table.getLayout();
        card.show(table, panel);
        CardLayout card2 = (CardLayout) option.getLayout();
        card2.show(option, panel);
    }
    
    public void changePanel(JPanel option,String panel){
        CardLayout card2 = (CardLayout) option.getLayout();
        card2.show(option, panel);
    }
    
    public void showOption(JPanel jpnMenuOption,JLabel jlbMenuOption,boolean menuOption){
        String icon = "drag_list_down_filled_50px";
        if (menuOption) {
            icon = "menu_48px";
        }
        new ImageShow().setIcon(jlbMenuOption, icon, "png", 40, 40);
        jpnMenuOption.setVisible(!menuOption);
    }
}
