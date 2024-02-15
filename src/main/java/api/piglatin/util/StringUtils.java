package api.piglatin.util;

import org.springframework.stereotype.Component;

@Component
public class StringUtils {
    public static int firstVowelIndex(String word){
        String vowels = "AEIOUYaeiouy";
        for (int i = 0; i < word.length(); i++){
            if(vowels.indexOf(word.charAt(i)) != -1 ){
                return i;
            }
        }
        return word.length();
    }
}
