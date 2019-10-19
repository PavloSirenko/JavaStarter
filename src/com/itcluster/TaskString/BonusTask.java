package com.itcluster.TaskString;
    /*Додаткова задача
    Знайти в тексті п'ять найбільш вживаних слів.
    Вивести на екран (в файл) слово та кількість.
     */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static com.itcluster.TaskString.Main.LIMIT_WORDS;

class BonusTask {

    void popWords(String[] arrayWords) throws IOException {
        File outFile = new File("text.out");
        FileWriter writeFile = new FileWriter(outFile);

        Set<String> unique = new HashSet<String>(Arrays.asList(arrayWords));
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String s: unique)
            hashMap.put(s, Collections.frequency(Arrays.asList(arrayWords), s));

        for (int counter = 0; counter < LIMIT_WORDS; counter++) {
            int maxValue = (Collections.max(hashMap.values()));

            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() == maxValue) {
                    writeFile.write(entry.getKey() + " - " + entry.getValue() + "\n");
                    entry.setValue(1);
                }
            }
        }
        writeFile.flush();
        writeFile.close();
    }
}
