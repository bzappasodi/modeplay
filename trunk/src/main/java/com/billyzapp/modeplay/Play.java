
package com.billyzapp.modeplay;


import javax.sound.midi.*;

public class Play {

    public void playMidi(int instrument, int note) {
        try {
            // Get the MIDI sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // Create a new sequence with PPQ timing and one track
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            // Change instrument
            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, 1, instrument, 0);
            track.add(new MidiEvent(instrumentChange, 1));

            // Note ON event
            ShortMessage noteOnMessage = new ShortMessage();
            noteOnMessage.setMessage(ShortMessage.NOTE_ON, 1, note, 100);
            track.add(new MidiEvent(noteOnMessage, 1));

            // Note OFF event
            ShortMessage noteOffMessage = new ShortMessage();
            noteOffMessage.setMessage(ShortMessage.NOTE_OFF, 1, note, 100);
            track.add(new MidiEvent(noteOffMessage, 16));

            // Set the sequence for the sequencer
            sequencer.setSequence(sequence);
            sequencer.start();

            // Wait for the note to play
            Thread.sleep(1500);

            // Close the sequencer
            sequencer.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}


