import java.util.Scanner;

public class Kdvhesaplama {
    public static void main(String[] args) {
        double para;
        double kdvOran;
        Scanner imp = new Scanner(System.in);
        System.out.println("Parayı Giriniz <:>");
        para = imp.nextDouble();
        boolean kdv = para > 1000;
        kdvOran = kdv ? 0.08 : 0.18;

        double  kdvTutari = para * kdvOran;

        System.out.println("KDV'li Fiyat: " + (para+ kdvTutari));
        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV' Tutarı: " + kdvTutari);

    }
}