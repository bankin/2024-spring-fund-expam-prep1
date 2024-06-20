package com.dictionaryapp.repo;

import com.dictionaryapp.model.entity.Language;
import com.dictionaryapp.model.entity.LanguageEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
    Language findByLanguageName(LanguageEnum languageName);
}
