package com.fiap.dbeSoulCoderz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.dbeSoulCoderz.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{

}
