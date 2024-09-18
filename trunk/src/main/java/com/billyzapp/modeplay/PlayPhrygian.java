package com.billyzapp.modeplay;

import java.util.Arrays;
import java.util.List;

import static com.billyzapp.modeplay.Constants.MIDI_CHANNEL;

public class PlayPhrygian {
    public void playIt(String key) {

        Play player = new Play();

        List<Integer> phrygianIntervals = Arrays.asList(4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26, 28);


        int baseNote = NoteMapper.mapNoteNumbers(key);

        for (int interval : phrygianIntervals) {
            player.playMidi(MIDI_CHANNEL, baseNote + interval);

        }
    }
}
