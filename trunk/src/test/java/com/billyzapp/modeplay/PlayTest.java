package com.billyzapp.modeplay;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.sound.midi.*;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayTest {

    @Mock
    private Sequencer mockSequencer;

    @Mock
    private Sequence mockSequence;

    @Mock
    private Track mockTrack;

    @InjectMocks
    private Play play;

    @BeforeEach
    public void setUp() throws Exception {
        // Initialize Mockito and mock static MidiSystem.getSequencer()
        MockitoAnnotations.openMocks(this);

        // Mock MidiSystem.getSequencer() to return mockSequencer
        mockStatic(MidiSystem.class);
        when(MidiSystem.getSequencer()).thenReturn(mockSequencer);

        // Mock the creation of the sequence and track
        when(mockSequencer.getSequence()).thenReturn(mockSequence);
        when(mockSequence.createTrack()).thenReturn(mockTrack);
    }

    @Test
    public void testPlayMidi() throws Exception {
        int instrument = 1;
        int note = 60; // MIDI note for Middle C

        // Act
        play.playMidi(instrument, note);

        // Verify that the sequencer was opened
        verify(mockSequencer).open();

        // Verify that a new sequence was created and set for the sequencer
        verify(mockSequencer).setSequence(any(Sequence.class));

        // Argument captor to capture the MidiEvent objects added to the track
        ArgumentCaptor<MidiEvent> eventCaptor = ArgumentCaptor.forClass(MidiEvent.class);

        // Verify that three events were added to the track (instrument change, NOTE_ON, NOTE_OFF)
        verify(mockTrack, times(3)).add(eventCaptor.capture());

        // Retrieve the captured events
        MidiEvent instrumentChangeEvent = eventCaptor.getAllValues().get(0);
        MidiEvent noteOnEvent = eventCaptor.getAllValues().get(1);
        MidiEvent noteOffEvent = eventCaptor.getAllValues().get(2);

        // Verify the content of the captured events
        assertMidiMessage(instrumentChangeEvent.getMessage(), ShortMessage.PROGRAM_CHANGE, instrument);
        assertMidiMessage(noteOnEvent.getMessage(), ShortMessage.NOTE_ON, note);
        assertMidiMessage(noteOffEvent.getMessage(), ShortMessage.NOTE_OFF, note);

        // Verify that the sequencer was started
        verify(mockSequencer).start();

        // Verify that the sequencer was closed
        verify(mockSequencer).close();
    }

    // Helper method to check the type and data of a MidiMessage
    private void assertMidiMessage(MidiMessage message, int expectedCommand, int expectedData1) {
        assertTrue(message instanceof ShortMessage);
        ShortMessage shortMessage = (ShortMessage) message;
        assertEquals(expectedCommand, shortMessage.getCommand());
        assertEquals(expectedData1, shortMessage.getData1());
    }
}
