package Zadacha_2;

import java.io.IOException;

public interface Copyable {
    public void copy(String pathCopiedFile, String pathDestinationFile) throws IOException;
}