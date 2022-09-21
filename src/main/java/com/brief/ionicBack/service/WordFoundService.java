package com.brief.ionicBack.service;

import com.brief.ionicBack.model.User;
import com.brief.ionicBack.model.WordFound;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface WordFoundService {

    List<WordFound> wordFoundList(User user);
    WordFound add(WordFound wordFound);
}
