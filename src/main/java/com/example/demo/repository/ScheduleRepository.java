package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

	Page<Schedule> findByUsername(PageRequest of, String id);

	
	
//	long countByUseremail(String username); //이메일로 센다

	Long countByUsername(String username);
}
