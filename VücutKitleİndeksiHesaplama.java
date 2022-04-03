import java.util.Scanner;

public class VücutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        double kilo, boy, endex ;

        System.out.println("lütfen boynuzu giriniz; ");
        Scanner imp = new Scanner(System.in);
        boy   = imp.nextFloat();
        System.out.println("lütfen kilonuzu giriniz; ");




        kilo  = imp.nextFloat();
        endex = (kilo / (boy *boy));
        System.out.println("vücut kütle indexiniz: " + endex);
    }
}
