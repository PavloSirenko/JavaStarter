package com.itcluster.TaskString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class OutputText {
    void outputTextFile(String text) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile);
        writeFile.write(text);
        writeFile.flush();
        writeFile.close();
    }
}

