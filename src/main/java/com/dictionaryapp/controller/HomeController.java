package com.dictionaryapp.controller;

import com.dictionaryapp.config.UserSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserSession userSession;

    public HomeController(UserSession userSession) {
        this.userSession = userSession;
    }

    @GetMapping("/")
    public String notLogged() {
        if (userSession.isUserLoggedIn()) {
            return "redirect:/home";
        }

        return "index";
    }


    @GetMapping("/home")
    public String logged() {
        if (!userSession.isUserLoggedIn()) {
            return "redirect:/";
        }

        // TODO: Fetch words for each category

        return "home";
    }
}
