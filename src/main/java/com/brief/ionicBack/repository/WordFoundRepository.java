package com.brief.ionicBack.repository;

import com.brief.ionicBack.model.WordFound;
import com.brief.ionicBack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("*")
@Transactional
public interface WordFoundRepository extends JpaRepository<WordFound, Long> {

    List<WordFound> findByUser(User user);

}