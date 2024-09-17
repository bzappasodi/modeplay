

package com.billyzapp.modeplay;


public class PlayPhrygian {
    public void playIt(String key) {

        Play ply = new Play();
        int totalNote;

        int mapNoteNumbers = NoteMapper.mapNoteNumbers(key);

        Integer[] phrygianIntervals = {
                4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26, 28
        };

        totalNote = mapNoteNumbers;

        for (int element : phrygianIntervals) {
            ply.playMidi(25, (totalNote + element));

        }
    }
}
