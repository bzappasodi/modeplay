package com.billyzapp.modeplay;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CurrentKey {

    public static String getValidKey(Scanner sc, String prompt) {
        boolean isValid = false;
        String selectedKey = null;
        String[] validKeys = {"A", "B", "C", "D", "E", "F", "G"};
        List<String> list = Arrays.asList(validKeys);

        while (isValid == false) {
            System.out.println(prompt);
            selectedKey = sc.next();
            if (selectedKey != null) {
                selectedKey = selectedKey.toUpperCase();
            }


            if (list.contains(selectedKey)) {
                System.out.println(selectedKey + " is a valid key");
                isValid = true;
            } else {
                System.out.println(selectedKey + " That's not a valid key");
                sc.next();

            }
        }
        return selectedKey;
    }

}
