
package com.billyzapp.modeplay;


public class PlayIonian {
    public void playIt(String key) {

        Play ply = new Play();

        Integer[] ionianIntervals = {
                0, 2, 4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24
        };

        for (int element : ionianIntervals) {
            ply.playMidi(25, (NoteMapper.mapNoteNumbers(key) + element));

        }
    }


}
