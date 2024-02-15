package api.piglatin.service;

import api.piglatin.domain.Translation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TranslationServiceTest {
    @InjectMocks
    TranslationService translationService;

    @Test
    @DisplayName("Translate <Stop> to <Opstay>")
    public void translate_1_ToPiglatin_whenSuccessfull(){
        String english = "Stop";
        String pigLatin = "Opstay";
        Translation translation = new Translation();
        translation.setEnglish(english);
        Translation translated = translationService.translateEnglish(translation);
        Assertions.assertThat(translated)
                .isNotNull();
        Assertions.assertThat(translated.getPigLatin())
                .isNotNull()
                .isEqualTo(pigLatin);

    }

    @Test
    @DisplayName("Translate <Eye> to <Eyeyay>")
    public void translate_2_ToPiglatin_whenSuccessfull(){
        String english = "Eye";
        String pigLatin = "Eyeyay";
        Translation translation = new Translation();
        translation.setEnglish(english);
        Translation translated = translationService.translateEnglish(translation);
        Assertions.assertThat(translated)
                .isNotNull();
        Assertions.assertThat(translated.getPigLatin())
                .isNotNull()
                .isEqualTo(pigLatin);

    }

    @Test
    @DisplayName("Translate <No littering> to <Onay itteringlay>")
    public void translate_3_ToPiglatin_whenSuccessfull(){
        String english = "No littering";
        String pigLatin = "Onay itteringlay";
        Translation translation = new Translation();
        translation.setEnglish(english);
        Translation translated = translationService.translateEnglish(translation);
        Assertions.assertThat(translated)
                .isNotNull();
        Assertions.assertThat(translated.getPigLatin())
                .isNotNull()
                .isEqualTo(pigLatin);

    }

    @Test
    @DisplayName("Translate <No shirts, no shoes, no service> to <Onay irtsshay, onay eosshay, onay ervicesay>")
    public void translate_4_ToPiglatin_whenSuccessfull(){
        String english = "No shirts, no shoes, no service";
        String pigLatin = "Onay irtsshay, onay oesshay, onay ervicesay";
        Translation translation = new Translation();
        translation.setEnglish(english);
        Translation translated = translationService.translateEnglish(translation);
        Assertions.assertThat(translated)
                .isNotNull();
        Assertions.assertThat(translated.getPigLatin())
                .isNotNull()
                .isEqualTo(pigLatin);

    }

    @Test
    @DisplayName("Translate <No persons under 14 admitted> to <Onay ersonspay underay 14 admitteday>")
    public void translate_5_ToPiglatin_whenSuccessfull(){
        String english = "No persons under 14 admitted";
        String pigLatin = "Onay ersonspay underay 14 admitteday";
        Translation translation = new Translation();
        translation.setEnglish(english);
        Translation translated = translationService.translateEnglish(translation);
        Assertions.assertThat(translated)
                .isNotNull();
        Assertions.assertThat(translated.getPigLatin())
                .isNotNull()
                .isEqualTo(pigLatin);

    }

    @Test
    @DisplayName("Translate <Hey buddy, get away from my car!> to <Eyhay uddybay, etgay awayay omfray ymay arcay>")
    public void translate_6_ToPiglatin_whenSuccessfull(){
        String english = "Hey buddy, get away from my car!";
        String pigLatin = "Eyhay uddybay, etgay awayay omfray ymay arcay";
        Translation translation = new Translation();
        translation.setEnglish(english);
        Translation translated = translationService.translateEnglish(translation);
        Assertions.assertThat(translated)
                .isNotNull();
        Assertions.assertThat(translated.getPigLatin())
                .isNotNull()
                .isEqualTo(pigLatin);

    }

}