package com.billyzapp.modeplay;


public class PlayDorian {

    public void playIt(String key) {

        Play ply = new Play();

        Integer[] dorianIntervals = {
                2, 4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26
        };

        for (int element : dorianIntervals) {
            ply.playMidi(25, (NoteMapper.mapNoteNumbers(key) + element));

        }
    }


}
