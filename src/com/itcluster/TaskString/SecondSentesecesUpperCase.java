package com.itcluster.TaskString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class SecondSentesecesUpperCase {

    void methodUpperCase(String[] array) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                writeFile.write(array[i].toUpperCase() + "\n");
            } else {
                writeFile.write(array[i] + "\n");
            }
        }
        writeFile.flush();
        writeFile.close();
    }
}
