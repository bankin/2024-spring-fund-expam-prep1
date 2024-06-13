package com.dictionaryapp.service;

import com.dictionaryapp.config.UserSession;
import com.dictionaryapp.model.dto.AddWordDTO;
import com.dictionaryapp.model.entity.Word;
import com.dictionaryapp.repo.LanguageRepository;
import com.dictionaryapp.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class WordsService {

    private final LanguageRepository languageRepository;
    private final UserRepository userRepository;
    private final UserSession userSession;

    public WordsService(LanguageRepository languageRepository, UserRepository userRepository, UserSession userSession) {
        this.languageRepository = languageRepository;
        this.userRepository = userRepository;
        this.userSession = userSession;
    }

    public void add(AddWordDTO data) {
        Word word = new Word();

        // TODO: Save and attach correct user + language
    }
}
