package com.example.bailam.DichVu.service.Impl;

import com.example.bailam.DichVu.entity.DichVu;
import com.example.bailam.DichVu.repository.dichvuRepository;
import com.example.bailam.DichVu.service.dichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dichvuServiceImpl implements dichvuService {
    @Autowired
    dichvuRepository repository;
    @Override
    public List<DichVu> getAll() {
        return repository.findAll();
    }

    @Override
    public void add(DichVu dichVu) {
repository.save(dichVu);
    }

    @Override
    public void delete(Integer id) {
repository.deleteById(id);
    }

    @Override
    public DichVu detail(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void update(DichVu dichVu) {
repository.save(dichVu);
    }
}
