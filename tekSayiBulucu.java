import java.util.Scanner;
public class tekSayiBulucu {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        sayi = inp.nextInt();
        int buyuk=0, kucuk=0, yedek;

        for (int i = 1; i <= sayi; i++) {
            System.out.println(i+". Sayiyi Giriniz.");
            yedek= inp.nextInt();
            if (i == 1) {
                buyuk = yedek;
                kucuk = yedek;
            }
            else {
                if (yedek >= buyuk) {
                    buyuk = yedek;
                } else if (yedek <= kucuk) {
                    kucuk = yedek;
                }

            }
        }

        System.out.println("Kucuk Sayı= "+kucuk);
        System.out.println("Buyuk Sayı= "+buyuk);
    }
}