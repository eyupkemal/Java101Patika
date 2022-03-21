//Bu projede taksimetre programı yaptım
//eger 20 tl den az ise 20 tl uygulanır
import java.util.Scanner;

public class Taksimetrehesaplama
{
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total ,startMoney = 10;
        Scanner imp = new Scanner(System.in);
        System.out.print("Mesafey Km Cinsinden Girriniz  ::");
        km = imp.nextInt();

        total =(km *perKm);
        total += startMoney;

        total = (total < 20) ? 20 : total;
        System.out.print("toplam tutar :" + total);
    }
}
