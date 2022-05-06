package com.example.service;

import com.example.model.Email;

public interface IEmailService {
    void save(Email email);

    Email getEmail();
}