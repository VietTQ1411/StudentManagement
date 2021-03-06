/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import BO.AccountBO;
import javax.swing.JOptionPane;
import util.ColorForm;
import util.DragListener;
import util.Effect;
import util.FormController;

/**
 *
 * @author Trần Việt
 */
public class SignUp extends javax.swing.JFrame {

    AccountBO accountBO = new AccountBO();
    Effect effect = new Effect();
    FormController controller = new FormController();
    boolean isDark = true;
    /**
     * Creates new form SignUp
     */
    public SignUp(boolean isDark) {
        initComponents();
        setLocationRelativeTo(null);
        this.isDark = isDark;
        setColor();
        
    }

    public void setColor(){
        ColorForm color = new ColorForm();
        
        color.PanelMouseEvent(isDark, jpnSignUp);
        color.LabelMouseEvent(isDark, jlbLogin);
        color.PanelBackGround(isDark, jpnCenter,jpnHead,jpnEnd,jpnMain,jpnSignUp);
        color.LabelBackGround(isDark, jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel7);
        color.JTextfierdBackGround(isDark, jpfPass,jpfRePass,jtfPIN,jtfUserName);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popSignIn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        popDark = new javax.swing.JMenuItem();
        popWhite = new javax.swing.JMenuItem();
        popExit = new javax.swing.JMenuItem();
        jpnMain = new javax.swing.JPanel();
        jpnHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnCenter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jtfPIN = new javax.swing.JTextField();
        jpfPass = new javax.swing.JPasswordField();
        jpfRePass = new javax.swing.JPasswordField();
        jpnSeparator = new javax.swing.JPanel();
        jpnEnd = new javax.swing.JPanel();
        jpnSignUp = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jlbLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSignIn = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuDark = new javax.swing.JMenuItem();
        menuWhite = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        popSignIn.setText("Sign In");
        popSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popSignInActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popSignIn);

        jMenu4.setText("Change background");

        popDark.setText("Dark background");
        popDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popDarkActionPerformed(evt);
            }
        });
        jMenu4.add(popDark);

        popWhite.setText("White background");
        popWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popWhiteActionPerformed(evt);
            }
        });
        jMenu4.add(popWhite);

        jPopupMenu1.add(jMenu4);

        popExit.setText("Exit");
        popExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popExitActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popExit);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(470, 580));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jpnMain.setPreferredSize(new java.awt.Dimension(526, 550));
        jpnMain.setLayout(new java.awt.BorderLayout());

        jpnHead.setPreferredSize(new java.awt.Dimension(520, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fill in the Information below");

        javax.swing.GroupLayout jpnHeadLayout = new javax.swing.GroupLayout(jpnHead);
        jpnHead.setLayout(jpnHeadLayout);
        jpnHeadLayout.setHorizontalGroup(
            jpnHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHeadLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpnHeadLayout.setVerticalGroup(
            jpnHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnMain.add(jpnHead, java.awt.BorderLayout.NORTH);

        jpnCenter.setPreferredSize(new java.awt.Dimension(520, 345));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Re-Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Enter your PIN (any number or text(50 character)):");

        jtfPIN.setText("123456");
        jtfPIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfPINFocusGained(evt);
            }
        });

        jpnSeparator.setBackground(new java.awt.Color(150, 150, 150));

        javax.swing.GroupLayout jpnSeparatorLayout = new javax.swing.GroupLayout(jpnSeparator);
        jpnSeparator.setLayout(jpnSeparatorLayout);
        jpnSeparatorLayout.setHorizontalGroup(
            jpnSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        jpnSeparatorLayout.setVerticalGroup(
            jpnSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnCenterLayout = new javax.swing.GroupLayout(jpnCenter);
        jpnCenter.setLayout(jpnCenterLayout);
        jpnCenterLayout.setHorizontalGroup(
            jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCenterLayout.createSequentialGroup()
                .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCenterLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnCenterLayout.createSequentialGroup()
                                .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpfRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(jtfPIN)))
                    .addGroup(jpnCenterLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jpnSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpnCenterLayout.setVerticalGroup(
            jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jtfPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jpnSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnMain.add(jpnCenter, java.awt.BorderLayout.CENTER);

        jpnEnd.setPreferredSize(new java.awt.Dimension(520, 80));

        jpnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnSignUpMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_user_26px.png"))); // NOI18N
        jLabel7.setText("Sign Up");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpnSignUpLayout = new javax.swing.GroupLayout(jpnSignUp);
        jpnSignUp.setLayout(jpnSignUpLayout);
        jpnSignUpLayout.setHorizontalGroup(
            jpnSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        jpnSignUpLayout.setVerticalGroup(
            jpnSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jlbLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_rounded_right_32px.png"))); // NOI18N
        jlbLogin.setText("Login");
        jlbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnEndLayout = new javax.swing.GroupLayout(jpnEnd);
        jpnEnd.setLayout(jpnEndLayout);
        jpnEndLayout.setHorizontalGroup(
            jpnEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEndLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jlbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jpnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jpnEndLayout.setVerticalGroup(
            jpnEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEndLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpnMain.add(jpnEnd, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("File");

        menuSignIn.setText("Sign In");
        menuSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSignInActionPerformed(evt);
            }
        });
        jMenu1.add(menuSignIn);

        jMenu3.setText("Change background");

        menuDark.setText("dark background");
        menuDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDarkActionPerformed(evt);
            }
        });
        jMenu3.add(menuDark);

        menuWhite.setText("white background");
        menuWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuWhiteActionPerformed(evt);
            }
        });
        jMenu3.add(menuWhite);

        jMenu1.add(jMenu3);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPINFocusGained
        jtfPIN.setText("");
    }//GEN-LAST:event_jtfPINFocusGained

    private void jpnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnSignUpMouseClicked
        accountBO.SignUp(this,isDark, jtfUserName, jpfPass, jpfRePass, jtfPIN);
    }//GEN-LAST:event_jpnSignUpMouseClicked

    private void jlbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbLoginMouseClicked
       this.dispose();
       new FormController().show(new SignIn(isDark));
    }//GEN-LAST:event_jlbLoginMouseClicked

    private void menuDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDarkActionPerformed
        isDark = true;
        setColor();
    }//GEN-LAST:event_menuDarkActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuWhiteActionPerformed
       isDark = false;
        setColor();
    }//GEN-LAST:event_menuWhiteActionPerformed

    private void menuSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSignInActionPerformed
       this.dispose();
       new FormController().show(new SignIn(isDark));
    }//GEN-LAST:event_menuSignInActionPerformed

    private void popSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popSignInActionPerformed
         this.dispose();
       new FormController().show(new SignIn(isDark));
    }//GEN-LAST:event_popSignInActionPerformed

    private void popDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popDarkActionPerformed
        isDark = true;
        setColor();
    }//GEN-LAST:event_popDarkActionPerformed

    private void popWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popWhiteActionPerformed
        isDark = false;
        setColor();
    }//GEN-LAST:event_popWhiteActionPerformed

    private void popExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popExitActionPerformed
         this.dispose();
    }//GEN-LAST:event_popExitActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(evt.getButton()==3){
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp(true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlbLogin;
    private javax.swing.JPasswordField jpfPass;
    private javax.swing.JPasswordField jpfRePass;
    private javax.swing.JPanel jpnCenter;
    private javax.swing.JPanel jpnEnd;
    private javax.swing.JPanel jpnHead;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnSeparator;
    private javax.swing.JPanel jpnSignUp;
    private javax.swing.JTextField jtfPIN;
    private javax.swing.JTextField jtfUserName;
    private javax.swing.JMenuItem menuDark;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuSignIn;
    private javax.swing.JMenuItem menuWhite;
    private javax.swing.JMenuItem popDark;
    private javax.swing.JMenuItem popExit;
    private javax.swing.JMenuItem popSignIn;
    private javax.swing.JMenuItem popWhite;
    // End of variables declaration//GEN-END:variables
}
