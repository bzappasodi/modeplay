package com.billyzapp.modeplay;

import java.util.Arrays;
import java.util.List;

import static com.billyzapp.modeplay.Constants.MIDI_CHANNEL;

public class PlayLocrian {

    public void playIt(String key) {
        Play player = new Play();

        // Locrian scale intervals in half-steps
        List<Integer> locrianIntervals = Arrays.asList(9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26, 28, 29, 31, 33);

        // Map the key to a base MIDI note number and play each interval in the Locrian scale
        int baseNote = NoteMapper.mapNoteNumbers(key);
        for (int interval : locrianIntervals) {
            player.playMidi(MIDI_CHANNEL, baseNote + interval);
        }
    }
}

