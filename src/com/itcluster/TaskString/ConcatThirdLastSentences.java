package com.itcluster.TaskString;

import java.io.*;

class ConcatThirdLastSentences {

    void methodConcatSentences(String[] array) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile);

        for (int i = array.length - 3; i < array.length; i++) {
            if (i == array.length - 3) writeFile.write(array[i] + ", ");
            if (i == array.length - 2) writeFile.write(array[i].toLowerCase() + ", ");
            if (i == array.length - 1) writeFile.write(array[i].toLowerCase() + ".");
        }       // ПЕРЕРОБИТИ ВИВІД В String!!!
        writeFile.flush();
        writeFile.close();
    }
}
