package com.example.TestTest.service;

import com.example.TestTest.repo.KundenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private KundenRepository kundenRepository;
}
