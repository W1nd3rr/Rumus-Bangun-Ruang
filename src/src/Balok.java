
import java.util.Scanner;


public class Balok {


    public static void main(String[] args) {
//  Program untuk menentukan luas permukaan dan volume suatu balok dari inputan user
        Scanner input = new Scanner(System.in);
        int p,l,t,luas,volume;
        System.out.println("Masukkan Panjang Balok : ");
        p = input.nextInt();
        System.out.println("Masukkan Lebar Balok : ");
        l = input.nextInt();
        System.out.println("Masukkan Tinggi Balok : ");
        t = input.nextInt();
        luas = 2 * (p*l + p*t + l*t);
        volume = p*l*t;
        System.out.println("Luas Permukaannya adalah " + luas + "cm dan Volumenya adalah " + volume + "cm");
    }
    
}
