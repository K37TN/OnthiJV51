package com.example.bailam.DichVu.controller;

import com.example.bailam.DichVu.entity.DichVu;
import com.example.bailam.DichVu.entity.LoaiDichVu;
import com.example.bailam.DichVu.service.dichvuService;
import com.example.bailam.DichVu.service.loaidichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dichvu")
public class dichvuController {
    @Autowired
    dichvuService service;
    @Autowired
    loaidichvuService service2;

    @GetMapping("/list")
    public String finall(Model model){
        model.addAttribute("list",service.getAll());
        return "dichvu/index";
    }
    @ModelAttribute("listloaidichvu")
    public List<LoaiDichVu> getAllCategory() {
        return service2.getDV();
    }
    @PostMapping("/add")
    public String add(DichVu dichVu){
        service.add(dichVu);
        return "reidrect:/dichvu/list";
    }
}
