package com.example.demo.anl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.anl.domain.Analysis;

interface IAnalysisRepository {
	
}

public interface AnalysisRepository extends JpaRepository<Analysis, Integer>, IAnalysisRepository {

}
