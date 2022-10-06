 // Created by 21343040_alixa arivya tofer
package com.mycompany.js6;
import javax.swing.JOptionPane;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas1JOptionPane {
    public static void main(String args[]) {
        int nilai1 , nilai2 , nilai3, rata;
        String a , b , c;
        
        a = JOptionPane.showInputDialog("Nilai ujian pertama : ");
        nilai1 = Integer.parseInt(a);
        b = JOptionPane.showInputDialog("Nilai ujian kedua : ");
        nilai2 = Integer.parseInt(b);
        c = JOptionPane.showInputDialog("Nilai ujian kedua : ");
        nilai3 = Integer.parseInt(c);
        
        rata = (nilai1 + nilai2 + nilai3) / 3;
        if(rata >= 60)
            JOptionPane.showMessageDialog(null, "Nilai rata-rata adalah : " +rata+ " :-)");
        else
            JOptionPane.showMessageDialog(null, "Nilai rata-rata adalah : " +rata+ " :-(");
    }
}
