package codegym.vn.entity;

import org.springframework.web.multipart.MultipartFile;

public class NhacForm {
    private String ten;
    private String ngheSi;
    private String theLoai;
    private MultipartFile file;

    public NhacForm() {
    }

    public NhacForm(String ten, String ngheSi, String theLoai, MultipartFile file) {
        this.ten = ten;
        this.ngheSi = ngheSi;
        this.theLoai = theLoai;
        this.file = file;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgheSi() {
        return ngheSi;
    }

    public void setNgheSi(String ngheSi) {
        this.ngheSi = ngheSi;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
