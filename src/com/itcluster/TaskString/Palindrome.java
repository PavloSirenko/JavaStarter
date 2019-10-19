package com.itcluster.TaskString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.itcluster.TaskString.Main.REGEX_WORDS;

class Palindrome {

    void methodPalindrome(String[] array, int SEVENTEEN) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile);

        CreateArrayRegex arrayObj = new CreateArrayRegex();
        String[] set = arrayObj.createArrayRegex(array[SEVENTEEN], REGEX_WORDS);

        for (int i = set.length - 1; i > -1; i--) {
            writeFile.write(set[i] + " ");
        }
        writeFile.flush();
        writeFile.close();
    }
}
