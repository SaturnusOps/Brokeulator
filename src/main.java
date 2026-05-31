import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Rechenwerte bestimmen
        System.out.print("Einmaligezahlung:");
        int intdeposit = scanner.nextInt();
        System.out.print("Monatliche Zahlungen:");
        int regulardeposit = scanner.nextInt();
        System.out.print("länge des investment:");
        float time = scanner.nextFloat();
        System.out.print("Zinsrate:");
        float rate = scanner.nextFloat();

        time = time * 12;
        int i = 0;
        float Value = intdeposit + regulardeposit;
        while ( i <= time) {
            System.out.print("\nJahr" + i);
            System.out.print("\n" + Value);
            Value = (Value + regulardeposit) * rate;
            i ++;
        }
        float Allregulardeposit = regulardeposit * time;
        float profit = Value - Allregulardeposit;
        System.out.print("\nEinmaligezahlung:" + intdeposit);
        System.out.print("\nMonatlichezahlungen:" + Allregulardeposit);
        System.out.print("\nProfite:" + profit );
    }
}
