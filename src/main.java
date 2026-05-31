import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Zeitraum für die Berechnung bestimmen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Möchtest du deine Jährlich / Quartalsweise / Monatlich / Täglich gewinne berechnen:");
        String Caltime = scanner.nextLine().toLowerCase();
        switch(Caltime) {
            case "jährlich":
                System.out.print("Jährlich gewinne");
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