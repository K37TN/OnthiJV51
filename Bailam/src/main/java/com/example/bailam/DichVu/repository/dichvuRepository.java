package com.example.bailam.DichVu.repository;

import com.example.bailam.DichVu.entity.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dichvuRepository extends JpaRepository<DichVu,Integer> {
}
