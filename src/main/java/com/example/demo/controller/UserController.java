package com.example.demo.controller;


import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Certificate;
import com.example.demo.model.ExaminationToCertificate;
import com.example.demo.model.User;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.repository.ExaminationRepository;
import com.example.demo.repository.ExaminationToCertificateRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CertificateRepository certificateRepository;
    @Autowired
    ExaminationRepository examinationRepository;
    @Autowired
    ExaminationToCertificateRepository examinationToCertificateRepository;

    @GetMapping("")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
    }

    @GetMapping("/test")
    public List<User> getExaminations() {
//        Certificate certificate = certificateRepository.findById(1L).orElseThrow(() -> new ResourceNotFoundException("Certificate", "id", 1));
//        List
//        return examinationToCertificateRepository.findAllByCertificate(certificate);


        return userRepository.findUsersByIdIn(new Long[]{1L, 3L, 4L});
    }


    @PostMapping("")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
}
