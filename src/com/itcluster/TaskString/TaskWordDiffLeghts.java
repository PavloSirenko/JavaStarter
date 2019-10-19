package com.itcluster.TaskString;

import java.io.IOException;

class TaskWordDiffLeghts {
    private OutputText outObj = new OutputText();

    void quantityWordDiffLeght(String[] array, int one, int two, int three) throws IOException {
        int qtyOne = 0, qtyTwo = 0, qtyThree = 0;

        for(String sent : array) {
            if (sent.length() == one) qtyOne++;
            if (sent.length() == two) qtyTwo++;
            if (sent.length() == three) qtyThree++;
        }

        outObj.outputTextFile(String.format(
                "This text have %d words!\n" +
                "This text have %d with a three letters!\n" +
                "This text have %d with a five letters!\n" +
                "This text have %d with a seven letters!",array.length, qtyOne, qtyTwo, qtyThree));
    }
}
