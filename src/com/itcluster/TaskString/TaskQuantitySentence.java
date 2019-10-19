package com.itcluster.TaskString;

import java.io.IOException;

class TaskQuantitySentence {
    private OutputText outObj = new OutputText();

    void qtySentenceText(String[] array) throws IOException {
        outObj.outputTextFile(String.format("This text have %d sentences!", array.length));
    }
}
