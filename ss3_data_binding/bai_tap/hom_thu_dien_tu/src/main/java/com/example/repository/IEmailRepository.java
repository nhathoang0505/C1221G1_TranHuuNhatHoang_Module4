package com.example.repository;


import com.example.model.Email;

public interface IEmailRepository {
    void save(Email email);

    Email getEmail();
}