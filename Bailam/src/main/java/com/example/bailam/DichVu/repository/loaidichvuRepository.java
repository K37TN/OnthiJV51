package com.example.bailam.DichVu.repository;

import com.example.bailam.DichVu.entity.LoaiDichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loaidichvuRepository extends JpaRepository<LoaiDichVu,Integer> {
}
