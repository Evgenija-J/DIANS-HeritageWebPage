package com.example.whereto.repository;

import com.example.whereto.model.heritage_table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonumentRepository extends JpaRepository<heritage_table, Long> {
    @Override
    List<heritage_table> findAll();
}
