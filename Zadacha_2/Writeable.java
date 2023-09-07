package Zadacha_2;

import java.io.IOException;

public interface Writeable {
    public void write(String path, String content) throws IOException;
}