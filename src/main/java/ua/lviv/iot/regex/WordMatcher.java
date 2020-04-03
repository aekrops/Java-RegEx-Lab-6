package ua.lviv.iot.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordMatcher {

    public WordMatcher() {
    }

    public static ArrayList<String> findWordsContainingGivenNumberOnSecondPosition(String text, int numberToFind) {
        ArrayList<String> collectedWords = new ArrayList<String>();
        Pattern pattern = Pattern.compile("\\b([A-Z]|[a-z])" + numberToFind + "\\w+\\b");
        Matcher matches = pattern.matcher(text);

        while (matches.find()) {
            collectedWords.add(matches.group());
        }

        return collectedWords;
    }
}
