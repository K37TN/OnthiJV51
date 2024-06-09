package com.example.bailam.DichVu.service;

import com.example.bailam.DichVu.entity.DichVu;
import com.example.bailam.DichVu.repository.dichvuRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface dichvuService {
 public List<DichVu> getAll();
 public void add(DichVu dichVu);
 public void delete(Integer id);
 public DichVu detail(Integer id);
 public void update(DichVu dichVu);
}
