package com.example.bailam.DichVu.service.Impl;

import com.example.bailam.DichVu.entity.LoaiDichVu;
import com.example.bailam.DichVu.repository.loaidichvuRepository;
import com.example.bailam.DichVu.service.loaidichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class loaidichvuServiceImpl implements loaidichvuService {
    @Autowired
    loaidichvuRepository repository;
    @Override
    public List<LoaiDichVu> getDV() {
        return repository.findAll();
    }
}
