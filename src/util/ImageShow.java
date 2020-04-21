/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Trần Việt
 */
public class ImageShow {
    public void setIcon(JLabel label,String imageName,String type,int height,int witdh) {
        String url = "/image/" + imageName + "."+type;
        try {
            label.setIcon(new ImageIcon((new javax.swing.ImageIcon(getClass().getResource(url))).getImage().getScaledInstance(height, witdh, java.awt.Image.SCALE_DEFAULT)));
        } catch (Exception x) {
            url = "/image/unknown.jpg";
            label.setIcon(new ImageIcon((new javax.swing.ImageIcon(getClass().getResource(url))).getImage().getScaledInstance(height, witdh, java.awt.Image.SCALE_DEFAULT)));
        }
    }
    public void setBackground(JScrollPane jScrollPane1){
        //The table will be transparent if neither itself nor the cells are opaque:
        //jTable1.setOpaque(false);
        //((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        //If the table is in a ScrollPane, it is to make transparent as well:        
        //jScrollPane1.setOpaque(false);
        //At least, you can remove the grid lines:        
        jScrollPane1.getViewport().setOpaque(false);
        //jTable1.setShowGrid(false);
    }
}
