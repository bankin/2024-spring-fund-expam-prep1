package com.dictionaryapp.controller;

import com.dictionaryapp.model.dto.AddWordDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WordController {

    @GetMapping("/words")
    public String viewAddWord() {
        return "word-add";
    }

    @PostMapping("/words")
    public String doAddWord(
        @Valid AddWordDTO data,
        BindingResult bindingResult,
        RedirectAttributes redirectAttributes
    ) {

    }
}
