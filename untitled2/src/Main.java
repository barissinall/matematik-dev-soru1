import java.util.Scanner;

public class Main {
    public static void yaz(Object veri) { System.out.println(veri); }
    public static void goster(Object veri) { System.out.print(veri); }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        yaz("--- İkinci Dereceden Denklem Kökü Bulma ---");

        goster("a katsayısını giriniz: ");
        double a = scanner.nextDouble();

        goster("b katsayısını giriniz: ");
        double b = scanner.nextDouble();

        goster("c katsayısını giriniz: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            yaz("Hata: a katsayısı 0 olamaz.");
        } else {
            double delta = (b * b) - (4 * a * c);
            yaz("Diskriminant (Delta): " + delta);

            if (delta < 0) {
                yaz("Gerçek kök yoktur.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                yaz("Tek bir gerçek kök vardır.");
                yaz("Kök: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                yaz("İki farklı gerçek kök vardır.");
                yaz("x1: " + x1);
                yaz("x2: " + x2);
            }
        }
        scanner.close();
    }
}