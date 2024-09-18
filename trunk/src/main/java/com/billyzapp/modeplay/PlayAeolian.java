package com.billyzapp.modeplay;

import java.util.Arrays;
import java.util.List;

import static com.billyzapp.modeplay.Constants.MIDI_CHANNEL;

public class PlayAeolian {
    public void playIt(String key) {

        Play player = new Play();

        List<Integer> aeolianIntervals = Arrays.asList(7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26, 28, 29, 31);

        int baseNote = NoteMapper.mapNoteNumbers(key);

        for (int interval : aeolianIntervals) {
            player.playMidi(MIDI_CHANNEL, baseNote + interval);


        }
    }


}
