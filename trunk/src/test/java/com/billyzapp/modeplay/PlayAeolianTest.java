package com.billyzapp.modeplay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.MockedStatic;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class PlayAeolianTest {

    private static final int MIDI_CHANNEL = 1; // Assuming a constant value for the MIDI channel

    @Mock
    private Play mockPlayer;

    @InjectMocks
    private PlayAeolian playAeolian;

    @BeforeEach
    public void setUp() {
        // Initialize the mocks
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPlayIt_WithValidKey() {
        // Arrange
        String key = "C";  // Simulate key input
        int baseNote = 60; // Assuming C maps to 60 in MIDI
        List<Integer> aeolianIntervals = Arrays.asList(7, 9, 11, 12, 14, 16, 17, 19, 21, 23, 24, 26, 28, 29, 31);

        // Mock the static method NoteMapper.mapNoteNumbers
        try (MockedStatic<NoteMapper> mockedNoteMapper = mockStatic(NoteMapper.class)) {
            // Mock the NoteMapper to return baseNote 60 for key "C"
            mockedNoteMapper.when(() -> NoteMapper.mapNoteNumbers(key)).thenReturn(baseNote);

            // Act
            playAeolian.playIt(key);

            // Assert
            for (int interval : aeolianIntervals) {
                // Verify that playMidi was called with the correct note (baseNote + interval)
                verify(mockPlayer).playMidi(MIDI_CHANNEL, baseNote + interval);
            }

            // Verify that no more interactions occurred
            verifyNoMoreInteractions(mockPlayer);
        }
    }
}
