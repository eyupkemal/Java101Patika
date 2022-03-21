import java.util.Scanner;

public class Diküçgen {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner girdi =new Scanner(System.in);
        System.out.print("1.kenarı giriniz");
        a = girdi.nextInt();
        System.out.print("2.kenarı giriniz");
        b = girdi.nextInt();
        System.out.print("3.kenarı giriniz");
        c = girdi.nextInt();
        double u = (a+b+c)/2;
        double ucgeninçevresi = 2*u;
        System.out.print("ucgeninçevresi :" + ucgeninçevresi );

        double alan =Math.sqrt(u* (ucgeninçevresi -a) * (ucgeninçevresi - b) *(ucgeninçevresi -c));
        System.out.print("alan :" + alan );
    }
}
