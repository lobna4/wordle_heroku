package com.brief.ionicBack.service.serviceImpl;

import com.brief.ionicBack.model.Word;
import com.brief.ionicBack.repository.WordRepository;
import com.brief.ionicBack.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WordServiceImpl implements WordService {

     @Autowired
    private WordRepository wordRepository;

    @Override
    public List<Word> wordList() {
        return wordRepository.findAll();
    }
}
