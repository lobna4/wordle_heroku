package com.brief.ionicBack.repository;

import com.brief.ionicBack.model.User;
import com.brief.ionicBack.model.Word;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("*")
@Transactional
public interface WordRepository extends JpaRepository<Word, Long> {

    @Override
    List<Word> findAll();
}