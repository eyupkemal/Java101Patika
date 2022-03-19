package giriş;

import  java.util.Scanner;

public class Ortalamahesaplama {
    public static void main(String[] args) {

        //değişken oluştur
        int mat;
        int fizik;
        int kimya;
        int turkce;
        int tarih;
        int muzik;

        //scanner sınıfımızı tanımladık
        Scanner imp = new Scanner(System.in);

        //kullanıcıdan degerleri al
        System.out.print("Matematik Notunuzu ;");
        mat = imp.nextInt();
        //kullanıcıdan degerleri al
        System.out.print("Fizik Notunuzu ;");
        fizik = imp.nextInt();
        //kullanıcıdan degerleri al
        System.out.print("turkce Notunuzu ;");
        kimya = imp.nextInt();

        //kullanıcıdan degerleri al
        System.out.print("tarih Notunuzu ;");
        tarih = imp.nextInt();

        //kullanıcıdan degerleri al
        System.out.print("Müzik Notunuzu ;");
        muzik = imp.nextInt();

        System.out.print("Türkçe Notunuzu ;");
        turkce = imp.nextInt();

        //bölme işlmei küsüratlı çıkabilir double daha uygun
        int ortalama = (mat + fizik + kimya + turkce + tarih +muzik);
        double sonuc = (ortalama / 6.0);
        System.out.print("Ortalamanız :" + sonuc);

        boolean gecmeDurumu;
        int gecer;

        gecer = 60;
        gecmeDurumu = ortalama >= gecer;
        String gk = gecmeDurumu ? "Geçti": "kaldı";

        System.out.print (gk);
    }
}
