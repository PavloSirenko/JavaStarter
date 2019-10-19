package com.itcluster.TaskString;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SumNumbersText {
    private Charset charset = StandardCharsets.UTF_8;

    void methodSum(String text, String REGEX) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile, charset);

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(text);

        int sum = 0;
        while(matcher.find()) {
            sum += Integer.parseInt(matcher.group());

        }
        System.out.println(sum);     //   -Dfile.encoding=UTF-8 -classpath ??
        writeFile.write(sum);
        writeFile.flush();
        writeFile.close();
    }
}
