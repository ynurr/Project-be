package com.example.demo.rev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.rev.domain.Review;

interface ReviewCustomRepository {
	
}

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewCustomRepository {

}
