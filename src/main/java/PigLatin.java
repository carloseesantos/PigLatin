import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    //Do pattern regex

    public static String translator(String english){
        final Pattern WORD_PATTERN = Pattern.compile("\\b([a-zA-Z]*)([^a-zA-Z]*)\\b");

        StringBuilder pinLatin = new StringBuilder();
        Matcher matcher = WORD_PATTERN.matcher(english);

        while(matcher.find()){
            String word = matcher.group(1);
            String noWord = matcher.group(2);

            if(!word.isEmpty()){
                String translated = translateWord(word);
                pinLatin.append(translated);
            }
            pinLatin.append(noWord);
        }

        return pinLatin.toString();
    }

    private static String translateWord(String word){
        int splitIndex = firstVowelIndex(word);
        String prefix = word.substring(0, splitIndex);
        String stem = word.substring(splitIndex);
        String end = word.matches("[AEIOUYaeiouy]*") ? "yay" : "ay";

        String translated = stem + prefix + end;

        if(Character.isUpperCase(word.charAt(0))){
            translated = Character.toUpperCase(translated.charAt(0)) + translated.substring(1).toLowerCase();
        }

        return translated;
    }

    private static int firstVowelIndex(@NotNull String word){
        String vowels = "AEIOUYaeiouy";
        for (int i = 0; i < word.length(); i++){
            if(vowels.indexOf(word.charAt(i)) != -1 ){
                return i;
            }
        }
        return word.length();
    }

    public static void main(String[] args){
        String[] tests = {
                "eye",
                "Stop",
                "No littering",
                "No shirts, no shoes, no service",
                "No persons under 14 admitted",
                "Hey buddy, get away from my car!"};

        Arrays.stream(tests).forEach(test -> System.out.println(translator(test)));
    }
}
