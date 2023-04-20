
package Tabung;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class tabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program untuk mencari luas permukaan dan volume tabung dari jari-jari dan tinggi yang diinput oleh user
        Scanner input = new Scanner(System.in);
        int r,t,luas,volume,phi;
        System.out.println("Masukkan nilai jari-jari : ");
        r = input.nextInt();
        System.out.println("Masukkan nilai tinggi : ");
        t = input.nextInt();
        phi = (int) Math.PI;
        luas =(int) (2 * phi * r * (r+t));
        volume = (int) (phi * Math.pow(r, 2) * 5);
        System.out.println("Luas permukaan adalah " + luas + "cm dan volume adalah " + volume + "cm");
    }
    
}
