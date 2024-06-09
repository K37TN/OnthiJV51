package com.example.bailam.DichVu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dich_vu")
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ten_dich_vu")
    private String ten;
    @Column(name = "don_gia")
    private Double donGia;
    @Column(name = "don_vi_tien")
private String donViTien;

    @ManyToOne
    @JoinColumn(name = "id_loai_dich_vu",referencedColumnName = "id")
    private LoaiDichVu loaiDichVu;
}
