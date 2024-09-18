
package com.billyzapp.modeplay;

import java.util.HashMap;
import java.util.Map;

public class NoteMapper {

    private static final Map<String, Integer> noteMap = new HashMap<>();

    // Static block to initialize the note map once
    static {
        noteMap.put("A", 45);
        noteMap.put("B", 47);
        noteMap.put("C", 48);
        noteMap.put("D", 50);
        noteMap.put("E", 52);
        noteMap.put("F", 53);
        noteMap.put("G", 43);
    }

    // Method to map note strings to their corresponding integer values
    public static int mapNoteNumbers(String note) {
        return noteMap.getOrDefault(note, 0);
    }
}
