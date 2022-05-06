package com.example.service.impl;

import com.example.model.Email;
import com.example.repository.IEmailRepository;
import com.example.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {
    @Autowired
    IEmailRepository emailRepository;

    @Override
    public void save(Email email) {
        emailRepository.save(email);
    }

    @Override
    public Email getEmail() {
        return emailRepository.getEmail();
    }
}