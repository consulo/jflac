/**
 * @author VISTALL
 * @since 2025-12-28
 */
module jflac.codec {
    requires java.desktop;

    provides javax.sound.sampled.spi.AudioFileReader with org.jflac.sound.spi.FlacAudioFileReader;
    provides javax.sound.sampled.spi.AudioFileWriter with org.jflac.sound.spi.FlacAudioFileWriter;
    provides javax.sound.sampled.spi.FormatConversionProvider with org.jflac.sound.spi.FlacFormatConversionProvider;
}