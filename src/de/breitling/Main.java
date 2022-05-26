package de.breitling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask for Data from Data from parent
        System.out.println("Hallo Vater oder Mutter. Bitte gib deinen Daten ein.");
        System.out.println("Guten Tag, Gib dein Name ein.");
        Scanner scanner = new Scanner(System.in);
        String namePerent = scanner.nextLine();

        System.out.println("Gib dein Alter ein.");
        int age = scanner.nextInt()

        System.out.println("Gib den Namen deiners Sohes oder deiner Tocher ein.");
        String childName = scanner.nextLine();

        // Ask for Data From Child.
        System.out.println("Hallo Du willst deinen Eltern eine Freude machen? Gib dein Daten ein.");
        System.out.println("Gin deinen Name ein.");
        String childNameEnterFromChild = scanner.nextLine();
        System.out.println("Gib dein Alter ein");
        int ageChild = scanner.nextInt();
        System.out.println("Gib den Vorname deines Vater oder Mutter ein.");
        String firstNameParent = scanner.nextLine();

        if (namePerent == firstNameParent && childName == childNameEnterFromChild) {
            System.out.println(namePerent + "Alles Gute zum Vatertag oder Muttertag.");
        }





    }
}
