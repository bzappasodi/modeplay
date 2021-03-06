package com.billyzapp.modeplay;

import java.util.Scanner;


public class CurrentMode {
    public static int getValidMode(Scanner sc) {
        int mode = 0;
        boolean isValid = false;
        while (!isValid) {
            modePrompt();
            if (sc.hasNextInt()) {
                mode = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error invalid input type try again!\n");
            }
            sc.nextLine();
        }
        return mode;
    }

    private static void modePrompt() {
        System.out.println("Enter mode");
        System.out.println("1) Dorian");
        System.out.println("2) Ionian");
        System.out.println("3) Phrygian");
        System.out.println("4) Lydian");
        System.out.println("5) Mixolydian");
        System.out.println("6) Aeolian");
        System.out.println("7) Locrian");
    }
}
