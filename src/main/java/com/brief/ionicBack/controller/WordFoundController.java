package com.brief.ionicBack.controller;

import com.brief.ionicBack.dto.WordFoundDTO;
import com.brief.ionicBack.model.Word;
import com.brief.ionicBack.model.WordFound;
import com.brief.ionicBack.repository.WordRepository;
import com.brief.ionicBack.service.serviceImpl.UserServiceImpl;
import com.brief.ionicBack.service.serviceImpl.WordFoundServiceImpl;
import com.brief.ionicBack.service.serviceImpl.detailsImpl.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
public class WordFoundController {

    @Autowired
    WordRepository wordRepository;

    @Autowired
    WordFoundServiceImpl wordFoundServiceImpl;

    @Autowired
    UserServiceImpl userService;


    @PostMapping("/api/wordfound")
    public WordFound add(@RequestBody WordFound wordFound){
        return wordFoundServiceImpl.add(wordFound);
    }


    @GetMapping("/api/wordfound")
    public List<WordFoundDTO> getAllWords(){

        long userId = ((UserDetailsImpl)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        List<WordFound> wordFound = wordFoundServiceImpl.wordFoundList(userService.findById(userId));

        List<WordFoundDTO> listWordFoundDTO = new ArrayList<>();

        for(WordFound wf : wordFound){
            listWordFoundDTO.add(new WordFoundDTO(wf));
        }

        return listWordFoundDTO;

    }



}
