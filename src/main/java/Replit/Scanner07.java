package Replit;

import java.util.Scanner;

public class Scanner07 {
    public static void main(String[] args) {

        //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen DOUBLE bir sayi giriniz");

        double sayi = input.nextDouble();

        int iSayi = (int) sayi;
        System.out.println("iSayi = " + iSayi);


    }
}
