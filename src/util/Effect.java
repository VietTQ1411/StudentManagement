/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import DAO.StudentDAO;
import entity.Account;
import java.awt.Cursor;
import javafx.scene.input.MouseButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Trần Việt
 */
public class Effect {
    public void LoadingMouse(JFrame frame,boolean isLoad){
        if(isLoad){
            frame.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        }
        else{
            frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }
    
    
    public void mainSetUp(JPanel jpnMenuOption,Account acc, JLabel... list){
        new ImageShow().setIcon(list[0], "logout_rounded_left_filled_100px", "png", 40, 40);
        new ImageShow().setIcon(list[1], "menu_48px", "png", 40, 40);
        list[2].setText(acc.getType()==0?"Dương":new StudentDAO().getOne(acc.getUserName()).getName());
        jpnMenuOption.setVisible(false);
    }
}
