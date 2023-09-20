package Replit;

import java.util.Scanner;

public class Scanner09 {
    public static void main(String[] args) {

       //Girilen zamanı saniyeye çeviren bir program yazınız.
       //Örnek Çıktı:
       //1 saat 10 dakika 50 saniye ==>
       //4250 saniye

        Scanner input = new Scanner(System.in);


        System.out.print("Saat giriniz ");
        int saat = input.nextInt();

        System.out.print("Dakika giriniz ");
        int dakika = input.nextInt();

        System.out.print("Saniye giriniz ");
        int saniye = input.nextInt();

        int toplamSaniye = (saat * 3600) + (dakika *60) + saniye;

        System.out.println("Girilen zaman " + saat + " saat " + dakika + " dakika " + saniye +  " saniye ==> " + "\n" + toplamSaniye + " saniye");







    }
}
