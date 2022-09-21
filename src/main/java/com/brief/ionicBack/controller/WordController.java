package com.brief.ionicBack.controller;

import com.brief.ionicBack.model.ERole;
import com.brief.ionicBack.model.Role;
import com.brief.ionicBack.model.Word;
import com.brief.ionicBack.playload.request.LoginRequest;
import com.brief.ionicBack.playload.request.SignupRequest;
import com.brief.ionicBack.playload.response.JwtResponse;
import com.brief.ionicBack.playload.response.MessageResponse;
import com.brief.ionicBack.repository.RoleRepository;
import com.brief.ionicBack.repository.WordRepository;
import com.brief.ionicBack.security.JwtUtils;
import com.brief.ionicBack.service.serviceImpl.detailsImpl.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
public class WordController {

    @Autowired
    WordRepository wordRepository;

    @GetMapping("/api/word")
    public List<Word> getAllWords(){
         return wordRepository.findAll();
    }

}
