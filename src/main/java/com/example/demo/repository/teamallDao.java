package com.example.demo.repository;

import com.example.demo.bean.teamallEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Map;

public interface teamallDao extends PagingAndSortingRepository <teamallEntity,String>{
    @Query(value = "SELECT teamname,teamnum,teamsel,tpass,phone FROM team", nativeQuery = true)
    List<Map<String, Object>> findIdAndAddress2();
}
