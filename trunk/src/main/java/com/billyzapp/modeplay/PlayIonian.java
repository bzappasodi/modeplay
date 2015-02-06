
package com.billyzapp.modeplay;


public class PlayIonian {
    public void playIt(String key) {

        Play ply = new Play();
        int totalNote;

        int mapNoteNumbers = NoteMapper.mapNoteNumbers(key);

/**
 * really the major scale
 */

        Integer[] ionianIntervals = {
               0, 2, 4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24
        };

        totalNote = mapNoteNumbers;

        for (int element : ionianIntervals) {
            ply.PlayMidi(25, (totalNote + element));

        }
    }


}