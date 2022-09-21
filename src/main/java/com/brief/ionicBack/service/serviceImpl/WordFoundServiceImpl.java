package com.brief.ionicBack.service.serviceImpl;

import com.brief.ionicBack.model.User;
import com.brief.ionicBack.model.WordFound;
import com.brief.ionicBack.repository.WordFoundRepository;
import com.brief.ionicBack.service.WordFoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WordFoundServiceImpl implements WordFoundService {

     @Autowired
    private WordFoundRepository wordFoundRepository;

    @Override
    public List<WordFound> wordFoundList(User user) {
        return wordFoundRepository.findByUser(user);
    }

    @Override
    public WordFound add(WordFound wordFound) {
        return wordFoundRepository.save(wordFound);
    }
}
