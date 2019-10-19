package com.itcluster.TaskString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class ThirdSentencesReplace {
    private static final String REGEX_VOWEN = "[AEIOUYaeiouy]";
    private static final String REGEX_Z = "Z";

    void methodReplace(String[] array) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile);

        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 2) {
                writeFile.write(array[i].replaceAll(REGEX_VOWEN, REGEX_Z) + "\n");
            } else {
                writeFile.write(array[i] + "\n");
            }
        }
        writeFile.flush();
        writeFile.close();
    }
}
