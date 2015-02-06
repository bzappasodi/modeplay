
package com.billyzapp.modeplay;

/**
 * @param note    the note selected
 * @param noteInt the note to midi note number conversion
 * @author Zapp c dorian is DEFGABC c:12 d:14 e:16 f:17 g:19 a:21 b:23\
 */
public class NoteMapper {

    String note;

    static int mapNoteNumbers(String note) {
        int noteInt = 0;

        if (note.equals("C")) {
            noteInt = 48;
        }

        if (note.equals("D")) {
            noteInt = 50;
        }

        if (note.equals("E")) {
            noteInt = 52;
        }

        if (note.equals("F")) {
            noteInt = 53;
        }

        if (note.equals("G")) {
            noteInt = 43;
        }

        if (note.equals("A")) {
            noteInt = 45;
        }

        if (note.equals("B")) {
            noteInt = 47;
        }

        return noteInt;
    }
}
