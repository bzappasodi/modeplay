package com.billyzapp.modeplay;


public class PlayDorian {


    int totalNote;
    Play ply = new Play();

    public void playIt(String key) {
        int mapNoteNumbers = NoteMapper.mapNoteNumbers(key);

        Integer[] dorianIntervals = {
                2, 4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26
        };

        totalNote = mapNoteNumbers;
        for (int element : dorianIntervals) {
            ply.PlayMidi(25, (totalNote + element));

        }
    }



}