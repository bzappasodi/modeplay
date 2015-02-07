package com.billyzapp.modeplay;

import java.util.Scanner;

/**
 * Main method to start the program
 * * @param validKeys list of valid musical keys

 *
 */
public class Modes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            int mode = CurrentMode.getValidMode(sc);
            String thisKey = CurrentKey.getValidKey(sc, "Enter key");

            PlayDorian d = new PlayDorian();
            PlayIonian i = new PlayIonian();
            PlayPhrygian f = new PlayPhrygian();
            PlayLydian l = new PlayLydian();
            PlayMixolydian m = new PlayMixolydian();
            PlayAeolian a = new PlayAeolian();
            PlayLocrian lo = new PlayLocrian();


            switch (mode) {
                case 1:
                    d.playIt(thisKey);
                    break;
                case 2:
                    i.playIt(thisKey);
                    break;
                case 3:
                    f.playIt(thisKey);
                    break;
                case 4:
                    l.playIt(thisKey);
                    break;
                case 5:
                    m.playIt(thisKey);
                    break;
                case 6:
                    a.playIt(thisKey);
                    break;
                case 7:
                    lo.playIt(thisKey);
                    break;
            }
            System.out.println();
            System.out.println("Continue y/n?");
            choice = sc.next();
            System.out.println();
        }

    }

}
