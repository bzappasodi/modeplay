/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.billyzapp.modeplay;


public class PlayLydian {
    public void playIt(String key) {

        Play ply = new Play();
        int totalNote;

        int mapNoteNumbers = NoteMapper.mapNoteNumbers(key);


        Integer[] lydianIntervals = {
                4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26,28
        };

        totalNote = mapNoteNumbers;

        for (int element : lydianIntervals) {
            ply.playMidi(25, (totalNote + element));


        }
    }
}

