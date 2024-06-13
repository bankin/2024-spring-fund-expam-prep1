package com.dictionaryapp.config;

import com.dictionaryapp.model.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class UserSession {
    private long id;
    private String username;

    public void login(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }


}
