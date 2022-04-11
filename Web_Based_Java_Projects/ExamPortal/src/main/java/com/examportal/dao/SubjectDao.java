package com.examportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.entity.Subject;

public interface SubjectDao extends JpaRepository<Subject, Integer> {

}
