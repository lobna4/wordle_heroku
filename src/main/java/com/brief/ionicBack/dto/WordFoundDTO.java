package com.brief.ionicBack.dto;

import com.brief.ionicBack.model.User;
import com.brief.ionicBack.model.Word;
import com.brief.ionicBack.model.WordFound;

import javax.persistence.*;
import java.util.Date;

public class WordFoundDTO {

    long id;
    //User user;
    //Word word;
    //Date date;
    long nb_tentative;

    public WordFoundDTO(WordFound wordfound) {
        this.id = wordfound.getId();
       // this.date = wordfound.getDate();
        this.nb_tentative = wordfound.getNb_tentative();
    }
}
