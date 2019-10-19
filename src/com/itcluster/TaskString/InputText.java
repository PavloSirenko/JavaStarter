package com.itcluster.TaskString;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class InputText {
    private Charset charset = StandardCharsets.UTF_8;

    String inputTextFile() throws IOException {
        File inputFile = new File("text.in");
        BufferedReader readFile = new BufferedReader(new FileReader(inputFile, charset));

        return readFile.readLine();
    }
}
