import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        //Zeitraum für die Berechnung bestimmen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Möchtest du deine Jährlich / Quartalsweise / Monatlich / Täglich gewinne berechnen:");
        String Caltime = scanner.nextLine().toLowerCase();
        // Rechenwerte bestimmen
        System.out.print("Einmaligezahlung:");
        int intdeposit = scanner.nextInt();
        System.out.print("Monatliche Zahlungen:");
        int regulardeposit = scanner.nextInt();
        System.out.print("länge des investment:");
        float time = scanner.nextFloat();
        System.out.print("Zinsrate:");
        float rate = scanner.nextFloat();

        switch(Caltime) {
            case "jährlich":
                double factor = Math.pow(1 +rate, time);
                double totalReturn = (intdeposit * factor) + (regulardeposit * (factor - 1) / rate);
                break;
            case "quartalsweise":
                System.out.print("Quartalsweise gewinne");
                break;
            case "monatlich":
                System.out.print("Monatlich gewinne");
                break;
            case "täglich":
                System.out.print("Täglich gewinne");
                break;
        }
    }
}
