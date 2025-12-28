package org.jflac.sound.spi;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.spi.AudioFileWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Stub for correcting returning {@link #getAudioFileTypes()}
 * 
 * @author VISTALL
 * @since 2025-12-28
 */
public class FlacAudioFileWriter extends AudioFileWriter {
    @Override
    public AudioFileFormat.Type[] getAudioFileTypes() {
        return new AudioFileFormat.Type[]{FlacFileFormatType.FLAC};
    }

    @Override
    public AudioFileFormat.Type[] getAudioFileTypes(AudioInputStream stream) {
        if (stream instanceof Flac2PcmAudioInputStream) {
            return getAudioFileTypes();
        }
        return new AudioFileFormat.Type[0];
    }

    @Override
    public int write(AudioInputStream stream, AudioFileFormat.Type fileType, OutputStream out) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public int write(AudioInputStream stream, AudioFileFormat.Type fileType, File out) throws IOException {
        throw new UnsupportedOperationException();
    }
}
