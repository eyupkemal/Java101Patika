import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args)
    {
        float pi = 3.14F;
        System.out.println("alani ve cevresi hesaplanacak dairenin yaricapini giriniz: ");

        Scanner inp = new Scanner(System.in);
        float yaricap = inp.nextFloat();
        float alan = pi*yaricap*yaricap;
        float cevre = 2*pi*yaricap;
        System.out.println("alan: " + alan + "   cevre: " + cevre);


        System.out.println("alani hesaplanacak daire diliminin yaricapini ve merkez acisini giriniz: ");
        yaricap = inp.nextFloat();
        float merkez_aci = inp.nextFloat();
        alan = pi*(yaricap*yaricap)*merkez_aci/360;
        System.out.println("alan: " + alan);
    }
}