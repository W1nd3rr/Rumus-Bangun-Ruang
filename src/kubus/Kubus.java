package kubus;

import java.util.Scanner;


public class Kubus {


    public static void main(String[] args) {
// Program Untuk mencari luas permukaan dan volume suatu kubus dari inputan user
        Scanner input = new Scanner(System.in);
        int sisi,luas,volume;
        System.out.println("Masukkan sisi kubus : ");
        sisi = input.nextInt();
        luas = (int) (6 * Math.pow(sisi, 2));
        volume = (int) (Math.pow(sisi, 3));
        System.out.println("Luas permukaan Kubus Adalah : " + luas + "cm dan Volume Kubus adalah : " + volume + "cm");
    }
    
}
