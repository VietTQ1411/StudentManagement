/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Random;

/**
 *
 * @author Trần Việt
 */
public class Support {
    public String RandomCode(){
        Random rd = new Random();
        String str = "";
        int numb = -1;
        for (int i = 0; i < 6; i++) {
            do {
                numb = rd.nextInt(255);
            } while (!(47 < numb && numb < 58) ^ !(64 < numb && numb < 91) ^ !(96 < numb && numb < 123));
            char temp = (char) numb;
            str += temp;
        }
        return str;
    }
}
