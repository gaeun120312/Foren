package com.example.application.board.classes;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    public String username;
    public String email;

    public User() { }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
