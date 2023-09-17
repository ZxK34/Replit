package Replit;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

     /* Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını
        ve çevresini konsola yazdıran bir program yazın  .

     Örnek Çıktı:
     Alan: 32
     Çevre: 24

*/


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Dikdortgenin kisa kenar uzunlugunu giriniz");
        int kisaKenar = input.nextInt();

        System.out.println("Lutfen Dikdortgenin uzun kenar uzunlugunu giriniz");
        int uzunKenar = input.nextInt();


        int alan = kisaKenar*uzunKenar;
        int cevre = 2 * (kisaKenar+uzunKenar);


        System.out.println("Alan = " + alan);
        System.out.println("Cevre = " + cevre);

    }
}
