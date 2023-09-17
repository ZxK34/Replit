package Replit;

import java.util.Scanner;

public class Scanner08 {
    public static void main(String[] args) {

       // Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
       // Örnek Çıktı:
       // Verilen tamsayının rakamları toplamı 10'dur.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");

        int sayi = input.nextInt();
        int toplami = 0;
        if (sayi>=100 && sayi<=999) {
            while (sayi > 0) {
                toplami += sayi % 10;
                sayi /= 10;
            }
            System.out.println("Girilen sayinin rakamlarinin toplami :" + toplami);
        }else {
            System.out.println("Gecersiz Sayi!!!");
        }









    }

}
