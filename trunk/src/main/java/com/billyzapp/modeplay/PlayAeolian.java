
package com.billyzapp.modeplay;


public class PlayAeolian {
    public void playIt(String key) {

        Play ply = new Play();
        int totalNote;

        int mapNoteNumbers = NoteMapper.mapNoteNumbers(key);


        Integer[] aeolianIntervals = {
                7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26,28,29,31
        };

        totalNote = mapNoteNumbers;

        for (int element : aeolianIntervals) {
            ply.PlayMidi(25, (totalNote + element));

        }
    }


}
