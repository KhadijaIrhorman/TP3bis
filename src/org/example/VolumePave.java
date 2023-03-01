package org.example;

import java.util.Scanner;

public class VolumePave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir la largueru de la base");
        float largueur = scanner.nextFloat();

        System.out.println("Veuillez saisir la longueur de la base");
        float longueur = scanner.nextFloat();

        System.out.println("Veuillez saisir la hauteur de la base");
        float hauteur = scanner.nextFloat();
        float somme = largueur*longueur*hauteur;

        System.out.println("le volume du pavé droit est égale à "  + somme);

    }

}
