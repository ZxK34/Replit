package Replit;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
       /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


        1 şeker = 1.7 gr


        Örnek Çıktı:
        çay=10
        şeker=2
        Yılda 12.41 kg şeker kullanıyor.

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Gunde kac cay ictiginizi giriniz");
        int caySayisi = input.nextInt();

        System.out.println("Lutfen bir cay icin kac tane seker kullandigini giriniz");
        double cSeker = input.nextDouble();

        double sekerSayisi = 365 *  (caySayisi*cSeker);

        double yillikSekerKg = sekerSayisi * 1.7;
        System.out.println(yillikSekerKg);


    }

}
