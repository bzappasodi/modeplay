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
            ply.playMidi(25, (totalNote + element));

        }
    }



}
//
//public class PlayDorian {
//
//    private int totalNote;
//    private final Play ply = new Play();
//
//    // Method to play the Dorian scale based on the provided key
//    public void playIt(String key) {
//        // Get the mapped note number for the given key
//        totalNote = NoteMapper.mapNoteNumbers(key);
//
//        // Define the Dorian mode intervals
//        final int[] dorianIntervals = { 2, 4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26 };
//
//        // Play each note in the Dorian scale
//        for (int interval : dorianIntervals) {
//            ply.PlayMidi(25, totalNote + interval);
////            ply.playMidi(25, totalNote + interval);
//        }
//    }
//}
