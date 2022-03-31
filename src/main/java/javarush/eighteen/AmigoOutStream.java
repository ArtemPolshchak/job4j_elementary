package javarush.eighteen;

import java.io.IOException;

public interface AmigoOutStream {

    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}