package Replit;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Kullanıcıdan bir Float değer girmesini isteyin,
        // bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Float bir deger giriniz");

        float sayi = input.nextFloat();
        System.out.println("Float = " + sayi);

        short sSayi = (short) sayi;
        System.out.println("short = " + sSayi);


    }
}
