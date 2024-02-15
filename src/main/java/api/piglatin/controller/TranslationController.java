package api.piglatin.controller;

import api.piglatin.domain.Translation;
import api.piglatin.service.TranslationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("translate")
@Log4j2
@RequiredArgsConstructor
public class TranslationController {
    @PostMapping
    public ResponseEntity<Translation> translate(@RequestBody Translation translation){
        return new ResponseEntity<>(TranslationService.translateEnglish(translation), HttpStatus.OK);
    }
}
