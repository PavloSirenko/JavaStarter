package com.itcluster.TaskString;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SeachDateInText {
    void searchDate(String text, String REGEX) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile);

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find())
            writeFile.write(matcher.group() + "\n");

        writeFile.flush();
        writeFile.close();
    }
}
