import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {
        double Armut, Elma, Domates, Muz, Patlican;
        double Armut_kg = 2.14, Elma_kg = 3.67, Domates_kg = 1.11, Muz_kg = 0.95, Patlican_kg = 5.00;
        Scanner imp = new Scanner(System.in);

        System.out.print("Armut kac kilo?:");
        Armut = imp.nextDouble();

        Armut *= Armut_kg;
        System.out.print("Elma kac kilo?:");
        Elma = imp.nextDouble();
        System.out.print("Domates kac kilo?:");
        Domates = imp.nextDouble();
        System.out.print("Muz kac kilo?:");
        Muz = imp.nextDouble();
        System.out.print("Patlican kac kilo?:");
        Patlican = imp.nextDouble();

        double total = Patlican + Muz + Domates + Elma + Armut;
        System.out.println("Borcunuz: " + total);
    }
}