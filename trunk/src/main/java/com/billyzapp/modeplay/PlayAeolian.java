
package com.billyzapp.modeplay;


public class PlayAeolian {
    public void playIt(String key) {

        Play ply = new Play();

        Integer[] aeolianIntervals = {
                7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26, 28, 29, 31
        };


        for (int element : aeolianIntervals) {
            ply.playMidi(25, (NoteMapper.mapNoteNumbers(key) + element));


        }
    }


}
