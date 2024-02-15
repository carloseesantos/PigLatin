package api.piglatin.service;

import api.piglatin.domain.Translation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static api.piglatin.util.StringUtils.firstVowelIndex;

@Service
@RequiredArgsConstructor
public class TranslationService {

    public static Translation translateEnglish(Translation translation){
        final Pattern WORD_PATTERN = Pattern.compile("\\b([a-zA-Z]*)([^a-zA-Z]*)\\b");

        StringBuilder pinLatin = new StringBuilder();
        Matcher matcher = WORD_PATTERN.matcher(translation.getEnglish());

        while(matcher.find()){
            String word = matcher.group(1);
            String noWord = matcher.group(2);

            if(!word.isEmpty()){
                String translated = translateWord(word);
                pinLatin.append(translated);
            }
            pinLatin.append(noWord);
        }
        translation.setPigLatin(pinLatin.toString());
        return translation;
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

}
