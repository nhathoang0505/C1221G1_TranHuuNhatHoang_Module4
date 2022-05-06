package com.example.repository.impl;


import com.example.model.Email;
import com.example.repository.IEmailRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository implements IEmailRepository {
    private Email email = new Email();

    @Override
    public void save(Email email) {
        this.email = email;
    }

    @Override
    public Email getEmail() {
        return email;
    }
}

