package com.billyzapp.modeplay;

import java.util.Arrays;
import java.util.List;

import static com.billyzapp.modeplay.Constants.MIDI_CHANNEL;

public class PlayIonian {
    public void playIt(String key) {

        Play player = new Play();

        List<Integer> ionianIntervals = Arrays.asList(0, 2, 4, 5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24
        );

        int baseNote = NoteMapper.mapNoteNumbers(key);
        for (int interval : ionianIntervals) {
            player.playMidi(MIDI_CHANNEL, baseNote + interval);
        }

    }

}
