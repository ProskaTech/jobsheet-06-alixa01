 // Created by 21343040_alixa arivya tofer
package com.mycompany.js6;
import java.util.Scanner;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas2switch {
    public static void main (String args[]){
        int angka;
        
        Scanner In = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        angka = In.nextInt();
        
        switch (angka) {
            case 1 -> System.out.println("Satu");
            case 2 -> System.out.println("Dua");
            case 3 -> System.out.println("Tiga");
            case 4 -> System.out.println("Empat");
            case 5 -> System.out.println("Lima");
            case 6 -> System.out.println("Enam");
            case 7 -> System.out.println("Tujuh");
            case 8 -> System.out.println("Delapan");
            case 9 -> System.out.println("Sembilan");
            case 10 -> System.out.println("Sepuluh");
            default -> {
            }
        }
        
        
    }
}
