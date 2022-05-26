package de.breitling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask for Data from Data from parent
        System.out.println("Hallo Vater oder Mutter. Bitte gib deinen Daten ein.");
        System.out.println("Guten Tag, Gib dein Name ein.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Gib dein Alter ein.");
        String age = scanner.nextLine();

        System.out.println("Gib den Namen deiners Sohes oder deiner Tocher ein.");
        String childName = scanner.nextLine();



    }
}
