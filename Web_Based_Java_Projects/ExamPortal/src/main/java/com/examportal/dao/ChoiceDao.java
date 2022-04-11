package com.examportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.entity.Choice;

public interface ChoiceDao extends JpaRepository<Choice, Integer> {

}
