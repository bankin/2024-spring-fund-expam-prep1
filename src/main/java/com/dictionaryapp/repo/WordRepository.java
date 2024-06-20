package com.dictionaryapp.repo;

import com.dictionaryapp.model.entity.Language;
import com.dictionaryapp.model.entity.User;
import com.dictionaryapp.model.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    List<Word> findByLanguageAndAddedBy(Language language, User addedBy);

    Optional<Word> findByIdAndAddedBy(String id, User user);
}
