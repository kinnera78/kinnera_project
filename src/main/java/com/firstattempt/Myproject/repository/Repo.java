package com.firstattempt.Myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstattempt.Myproject.model.LoginDetails;

public interface Repo extends JpaRepository<LoginDetails, Integer> {

}
