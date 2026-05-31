import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Rechenwerte bestimmen
        System.out.print("Einmaligezahlung:");
        int intdeposit = scanner.nextInt();
        System.out.print("Monatliche Zahlungen:");
        int regulardeposit = scanner.nextInt();
        System.out.print("Monatliche Zinsrate:");
        float rate = scanner.nextFloat() / 100;
        System.out.print("länge des investment:");
        float time = scanner.nextFloat();

        int totalMonths = (int) (time * 12);
        int i = 0;
        float Value = intdeposit + regulardeposit;
        while ( i <= totalMonths) {
            Value = Value * (1 + rate) + regulardeposit;
            if ( i % 12 == 0){
                int jahr = i / 12;
                System.out.println("Jahr " + jahr + ": " + String.format("%.2f", Value) + "€");
            }
            i ++;
        }
        float Allregulardeposit = regulardeposit * time;
        float profit = Value - Allregulardeposit;
        System.out.print("\nEinmaligezahlung:" + intdeposit);
        System.out.print("\nMonatlichezahlungen:" + Allregulardeposit);
        System.out.print("\nProfite:" + profit );
    }
}
