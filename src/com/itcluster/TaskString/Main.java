package com.itcluster.TaskString;

import java.io.IOException;
/*Practical Task
        • ++ Згенерувати текст який містить більше 10_000 символів (generator)
        • ++ Порахувати скільки в тексті є слів з довжиною 3, 5, 7 символів
        • ++ Порахувати скільки речень є в тесті
        • ++ Кожне друге речення перевести до верхнього регістру
        • ++ В кожному третьому реченні заміняти голосні на приголосні
        • ++ Останні три речення об'єднати в одне використовуючи коми
        • ++ Знайти скільки в тесті є дат (формати: 1996, 2003-02-01)
        • ++ Знайти суму всіх чисел в тесті
        • ++ В 17ому реченні всі слова вивести в зворотному порядку
        • ++ Bonus Task
        */

public class Main {
    static final String REGEX_WORDS = "\\s*([\\s*.?!;,])\\s*";
    private static final String REGEX_SENTENCES = "\\s*([?;!.])\\s*";
    private static final String REGEX_DATE = "[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])|[0-9]{3,4}";
    private static final String REGEX_NUMBER = "-?\\d+";
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int SEVEN = 7;
    private static final int SEVENTEEN = 16;

    public static void main(String[] args) throws IOException {
        InputText inObj = new InputText();
        CreateArrayRegex arrayObj = new CreateArrayRegex();
        TaskWordDiffLeghts wordTask = new TaskWordDiffLeghts();
        TaskQuantitySentence sentTask = new TaskQuantitySentence();
        SecondSentesecesUpperCase sentUpCase = new SecondSentesecesUpperCase();
        ThirdSentencesReplace sentRepl = new ThirdSentencesReplace();
        ConcatThirdLastSentences sentConcat = new ConcatThirdLastSentences();
        SeachDateInText date = new SeachDateInText();
        SumNumbersText sumNum = new SumNumbersText();
        Palindrome textPal = new Palindrome();
        BonusTask bonus = new BonusTask();

                //Generate text that contains more than 10,000 characters.
        String text = inObj.inputTextFile();

                //Count how many words 3, 5, 7 characters are in the text.
        wordTask.quantityWordDiffLeght(arrayObj.createArrayRegex(text, REGEX_WORDS), THREE, FIVE, SEVEN);

                //Count how many sentences are in the text.
        sentTask.qtySentenceText(arrayObj.createArrayRegex(text, REGEX_SENTENCES));

                //Translate every second sentence to uppercase.
        sentUpCase.methodUpperCase(arrayObj.createArrayRegex(text, REGEX_SENTENCES));

                //Replace vowels with consonants in every third sentence.
        sentRepl.methodReplace(arrayObj.createArrayRegex(text, REGEX_SENTENCES));

                //Combine the last three sentences into one using commas.
        sentConcat.methodConcatSentences(arrayObj.createArrayRegex(text, REGEX_SENTENCES));

                //Find how many dates are in the test (formats: 1996, 2003-02-01).
        date.searchDate(text, REGEX_DATE);

                //Find the sum of all numbers in the test.
        sumNum.methodSum(text, REGEX_NUMBER);

                //In the 17th sentence, put all the words in reverse order.
        textPal.methodPalindrome(arrayObj.createArrayRegex(text, REGEX_SENTENCES), SEVENTEEN);

                //Bonus Task!
        bonus.popWords(arrayObj.createArrayRegex(text.toLowerCase(), REGEX_WORDS));
    }
}
