package com.codegym.entity;

import java.util.Date;

public class FormYTe {
    private String ten;
    private int namSinh;
    private boolean gioiTinh;
    private String quocTich;
    private String cmnd;
    private String diLai;
    private String soHieuPhuongTien;
    private Date ngayKhoiHanh;
    private String tinhThanhPhoDaDi;

    public FormYTe() {
    }

    public FormYTe(String ten, int namSinh, boolean gioiTinh, String quocTich, String cmnd, String diLai, String soHieuPhuongTien, Date ngayKhoiHanh, String tinhThanhPhoDaDi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.quocTich = quocTich;
        this.cmnd = cmnd;
        this.diLai = diLai;
        this.soHieuPhuongTien = soHieuPhuongTien;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.tinhThanhPhoDaDi = tinhThanhPhoDaDi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getDiLai() {
        return diLai;
    }

    public void setDiLai(String diLai) {
        this.diLai = diLai;
    }

    public String getSoHieuPhuongTien() {
        return soHieuPhuongTien;
    }

    public void setSoHieuPhuongTien(String soHieuPhuongTien) {
        this.soHieuPhuongTien = soHieuPhuongTien;
    }

    public Date getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(Date ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getTinhThanhPhoDaDi() {
        return tinhThanhPhoDaDi;
    }

    public void setTinhThanhPhoDaDi(String tinhThanhPhoDaDi) {
        this.tinhThanhPhoDaDi = tinhThanhPhoDaDi;
    }
}
