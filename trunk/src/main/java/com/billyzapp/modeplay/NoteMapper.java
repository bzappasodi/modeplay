
package com.billyzapp.modeplay;

import java.util.*;

/**
 * @param note    the note selected
 * @param noteInt the note to midi note number conversion
 * @author Zapp c dorian is DEFGABC c:12 d:14 e:16 f:17 g:19 a:21 b:23\
 */
public class NoteMapper {

    static int mapNoteNumbers(String note) {
        Integer value = 0;
        Map<String, Integer> lhm = new HashMap();
        lhm.put("A", 45);
        lhm.put("B", 47);
        lhm.put("C", 48);
        lhm.put("D", 50);
        lhm.put("E", 52);
        lhm.put("F", 53);
        lhm.put("G", 43);

        // Get a set of the entries
        Set set = lhm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            if (me.getKey().equals(note)) {
                value = (Integer) me.getValue();
            }
        }


        return value;

    }
}
