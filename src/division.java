import java.util.Scanner;

public class division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextInt();

        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextInt();
        float somme = premierEntier/deuxiemeEntier;

        System.out.println("La quotien de " + premierEntier + " par " + deuxiemeEntier + "est egale a " + somme);

    }
}
