package com.dictionaryapp.model.dto;

import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

// TODO: Validation
public class AddWordDTO {

    private String term;

    private String translation;

    private String example;

    private LocalDate inputDate;

    private String language;

    public AddWordDTO() {}

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public LocalDate getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
