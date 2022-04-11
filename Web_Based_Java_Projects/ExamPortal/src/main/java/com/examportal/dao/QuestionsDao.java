package com.examportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examportal.entity.Question;

public interface QuestionsDao extends JpaRepository<Question, Integer> {

}
