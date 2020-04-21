/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Trần Việt
 */
public class ColorForm {

    private int BackGround = 240;
    private int BackGroundJText = 255;
    private int TextColorNomal = 0;
    private int BackGroundMouseEntered = 225;
    private int BackGroundMousePresses = 210;
    private int borderNomal = 0;
    private int boderEntered = 120;
    private int TextColor = 150;
    private int TextColorMouseEntered = 80;
    private int TextColorMousePresses = 15;

    public void PanelMouseEvent(boolean darkChoice, JPanel... listPanel) {
        if (darkChoice) {
            BackGround = 51;
            BackGroundMouseEntered = 71;
            BackGroundMousePresses = 91;
            borderNomal = 170;
        }
        Color nomalLook = new java.awt.Color(BackGround, BackGround, BackGround);
        Color onMouseEntered = new java.awt.Color(BackGroundMouseEntered, BackGroundMouseEntered, BackGroundMouseEntered);
        Color onMousePresses = new java.awt.Color(BackGroundMousePresses, BackGroundMousePresses, BackGroundMousePresses);
        LineBorder boder = (LineBorder) javax.swing.BorderFactory.createLineBorder(new java.awt.Color(borderNomal, borderNomal, borderNomal));
        LineBorder boderEnter = (LineBorder) javax.swing.BorderFactory.createLineBorder(new java.awt.Color(boderEntered, boderEntered, boderEntered));

        for (JPanel Panel : listPanel) {
            Panel.setBorder(boder);
            Panel.addMouseListener(new MouseAdapter() {
                /**
                 * Khi click và giữ chuột
                 */
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    Panel.setBackground(onMousePresses);
                    Panel.setBorder(boder);
                }

                /**
                 * Khi click rồi nhả chuột ra
                 */
                @Override
                public void mouseReleased(java.awt.event.MouseEvent e) {
                    Panel.setBackground(onMouseEntered);
                    Panel.setBorder(boderEnter);
                }

                /**
                 * Khi di chuột vào
                 */
                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    Panel.setBorder(boderEnter);
                    Panel.setBackground(onMouseEntered);

                }

                /**
                 * Khi di chuột ra
                 */
                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    Panel.setBorder(boder);
                    Panel.setBackground(nomalLook);

                }
            });
        }
    }

    public void LabelMouseEvent(boolean darkChoice, JLabel... listLabel) {
        if (darkChoice) {
            TextColor = 110;
            TextColorMouseEntered = 155;
            TextColorMousePresses = 205;

        }
        Color nomalLook = new java.awt.Color(TextColor, TextColor, TextColor);
        Color onMouseEntered = new java.awt.Color(TextColorMouseEntered, TextColorMouseEntered, TextColorMouseEntered);
        Color onMousePresses = new java.awt.Color(TextColorMousePresses, TextColorMousePresses, TextColorMousePresses);

        for (JLabel Label : listLabel) {
            Label.setForeground(nomalLook);
            Label.addMouseListener(new MouseAdapter() {
                /**
                 * Khi click và giữ chuột
                 */
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    Label.setForeground(onMousePresses);
                }

                /**
                 * Khi click rồi nhả chuột ra
                 */
                @Override
                public void mouseReleased(java.awt.event.MouseEvent e) {
                    Label.setForeground(onMouseEntered);
                }

                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    Label.setForeground(onMouseEntered);
                }

                /**
                 * Khi di chuột ra
                 */
                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    Label.setForeground(nomalLook);
                }
            });
        }
    }

    public void PanelBackGround(boolean darkChoice, JPanel... listPanel) {
        if (darkChoice) {
            BackGround = 51;
        }
        Color nomalLook = new java.awt.Color(BackGround, BackGround, BackGround);
        for (JPanel jPanel : listPanel) {
            jPanel.setBackground(nomalLook);
        }
    }

    public void LabelBackGround(boolean darkChoice, JLabel... listLabel) {
        if (darkChoice) {
            TextColorNomal = 190;
        }
        Color nomalLook = new java.awt.Color(TextColorNomal, TextColorNomal, TextColorNomal);
        for (JLabel jLabel : listLabel) {
            jLabel.setForeground(nomalLook);
        }
    }

    public void JTextfierdBackGround(boolean darkChoice, JTextField... list) {

        if (darkChoice) {
            BackGroundJText = 120;
            TextColorNomal = 240;
        }
        Color nomalLook = new java.awt.Color(BackGroundJText, BackGroundJText, BackGroundJText);
        Color textColor = new java.awt.Color(TextColorNomal, TextColorNomal, TextColorNomal);
        for (JTextField jTextField : list) {
            jTextField.setBackground(nomalLook);
            jTextField.setForeground(textColor);
        }
    }

    public void JTextAreaBackGround(boolean darkChoice, JTextArea... list) {

        if (darkChoice) {
            BackGroundJText = 120;
            TextColorNomal = 240;
        }
        Color nomalLook = new java.awt.Color(BackGroundJText, BackGroundJText, BackGroundJText);
        Color textColor = new java.awt.Color(TextColorNomal, TextColorNomal, TextColorNomal);
        for (JTextArea JTextArea : list) {
            JTextArea.setBackground(nomalLook);
            JTextArea.setForeground(textColor);
        }
    }

    public void JPassWordBackGround(boolean darkChoice, JPasswordField... list) {

        if (darkChoice) {
            BackGroundJText = 120;
            TextColorNomal = 240;
        }
        Color nomalLook = new java.awt.Color(BackGroundJText, BackGroundJText, BackGroundJText);
        Color textColor = new java.awt.Color(TextColorNomal, TextColorNomal, TextColorNomal);
        for (JPasswordField JPasswordField : list) {
            JPasswordField.setBackground(nomalLook);
            JPasswordField.setForeground(textColor);
        }
    }

    public void JCheckBoxBackGround(boolean darkBoard, JCheckBox... list) {
        if (darkBoard) {
            BackGround = 51;
            TextColorNomal = 180;
        }
        Color nomalLook = new java.awt.Color(BackGround, BackGround, BackGround);
        Color textColor = new java.awt.Color(TextColorNomal, TextColorNomal, TextColorNomal);
        for (JCheckBox JCheckBox : list) {
            JCheckBox.setBackground(nomalLook);
            JCheckBox.setForeground(textColor);
        }
    }

    public void JRadioBackGround(boolean darkBoard, JRadioButton... list) {
        if (darkBoard) {
            BackGround = 51;
            TextColorNomal = 180;
        }
        Color nomalLook = new java.awt.Color(BackGround, BackGround, BackGround);
        Color textColor = new java.awt.Color(TextColorNomal, TextColorNomal, TextColorNomal);
        for (JRadioButton JRadioButton : list) {
            JRadioButton.setBackground(nomalLook);
            JRadioButton.setForeground(textColor);
        }
    }

    public void JScrollPaneBackground(boolean darkBoard, JScrollPane... list) {
        if (darkBoard) {
            BackGround = 51;
        }
        Color nomalLook = new java.awt.Color(BackGround, BackGround, BackGround);
        for (JScrollPane jScrollPane : list) {
            jScrollPane.setBackground(nomalLook);
            jScrollPane.getViewport().setOpaque(false);
        }
    }

    public void JTableBackground(boolean darkBoard, JTable... list) {
        if (darkBoard) {
            BackGround = 51;
            TextColorNomal = 180;
        }
        Color nomalLook = new java.awt.Color(BackGround, BackGround, BackGround);
        Color textColor = new java.awt.Color(TextColorNomal, TextColorNomal, TextColorNomal);
        for (JTable jTable : list) {
            jTable.setForeground(textColor);
            jTable.setBackground(nomalLook);
        }
    }

    public void WrongJTextFierd(JTextField list) {
        list.setBorder((LineBorder) javax.swing.BorderFactory.createLineBorder(Color.RED));
        list.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomalJTextFierd( list);
            }
        });
    }

    public void NomalJTextFierd(JTextField list) {
        list.setBorder(null);
    }
    public void WrongJTextArea(JTextArea list) {
        list.setBorder((LineBorder) javax.swing.BorderFactory.createLineBorder(Color.RED));
        list.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomalJTextArea( list);
            }
        });
    }

    public void NomalJTextArea(JTextArea list) {
        list.setBorder(null);
    }
}
