package com.example.demo.repository;

import com.example.demo.bean.team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teamDao extends JpaRepository<team,Integer> {
}
