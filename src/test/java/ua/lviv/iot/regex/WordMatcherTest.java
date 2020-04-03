package ua.lviv.iot.regex;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class WordMatcherTest {
    public int number;
    public String text;
    public ArrayList<String> expectedResult = new ArrayList<String>();
    public ArrayList<String> collectedWords = new ArrayList<String>();

    @Test
    void testFindWordsContainingGivenNumberOnSecondPosition() {
        Scanner numberToFind = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        number = numberToFind.nextInt();

        Scanner textToCheck = new Scanner(System.in);
        System.out.println("Enter the text to check: ");
        text = textToCheck.nextLine();
        number = 3;
        text = "H3llo T2mme how are you? S3cret are here. Time 4you.S4vage. H5life.";
        collectedWords = WordMatcher.findWordsContainingGivenNumberOnSecondPosition(text, number);

        expectedResult.add("H3llo");
        expectedResult.add("S3cret");

        // Number: 3
        // Text: "H3llo T2mme how are you? S3cret are here. Time 4you.S4vage. H5life."
        // expected: H3llo, S3cret
        assertEquals(expectedResult, collectedWords);
        System.out.println("Collected words: "+ collectedWords);
        numberToFind.close();
        textToCheck.close();
    }

}
