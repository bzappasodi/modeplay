
package com.billyzapp.modeplay;


import javax.sound.midi.*;
//
///**
// * @param instrument the type of instrument that will play the note
// * @param note       the midi note number
// */
//public class Play {
//
//    public void PlayMidi(int instrument, int note) {
//
//        try {
//            Sequencer player = MidiSystem.getSequencer();
//            player.open();
//            Sequence seq = new Sequence(Sequence.PPQ, 4);
//            Track track = seq.createTrack();
//
//            MidiEvent Event = null;
//
//            ShortMessage first = new ShortMessage();
//            first.setMessage(192, 1, instrument, 0);
//            MidiEvent changeInstrument = new MidiEvent(first, 1);
//            track.add(changeInstrument);
//
//            ShortMessage a = new ShortMessage();
//            a.setMessage(144, 1, note, 100);
//            MidiEvent noteOn = new MidiEvent(a, 1);
//            track.add(noteOn);
//
//            ShortMessage b = new ShortMessage();
//            b.setMessage(128, 1, note, 100);
//            MidiEvent noteOff = new MidiEvent(b, 16);
//
//            track.add(noteOff);
//            player.setSequence(seq);
//            player.start();
//            Thread.sleep(1500);
//            player.close();
//
//        } catch (Exception ex) {
//        }
//    }
//}
//import javax.sound.midi.*;

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


