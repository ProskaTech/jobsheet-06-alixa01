 // Created by 21343040_alixa arivya tofer
package com.mycompany.js6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas1BufferedReader {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b, c;
        int nilai1, nilai2, nilai3, rata;
        
        try {
            System.out.print("Nilai ujian pertama : ");
            a = dataIn.readLine();
            nilai1 = Integer.parseInt(a);
            System.out.print("Nilai ujian kedua : ");
            b = dataIn.readLine();
            nilai2 = Integer.parseInt(b);
            System.out.print("Nilai ujian ketiga : ");
            c = dataIn.readLine();
            nilai3 = Integer.parseInt(c);
            
            rata = (nilai1 + nilai2 + nilai3) / 3;
            
            if(rata >= 60)
                System.out.println("Nilai rata-rata adalah : " +rata+ " :-)");
            else
                System.out.println("Nilai rata-rata adalah : " +rata+ " :-(");
            
        }
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        
    }
}
