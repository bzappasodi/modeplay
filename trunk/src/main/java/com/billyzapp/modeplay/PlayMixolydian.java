/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.billyzapp.modeplay;

import java.util.Arrays;
import java.util.List;

import static com.billyzapp.modeplay.Constants.MIDI_CHANNEL;

public class PlayMixolydian {
    public void playIt(String key) {

        Play player = new Play();

        List<Integer> mixolydianIntervals = Arrays.asList(5, 7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26, 28, 29);

        int baseNote = NoteMapper.mapNoteNumbers(key);

        for (int interval : mixolydianIntervals) {
            player.playMidi(MIDI_CHANNEL, baseNote + interval);
        }
    }
}

