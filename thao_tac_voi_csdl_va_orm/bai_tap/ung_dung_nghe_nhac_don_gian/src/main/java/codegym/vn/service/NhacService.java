package codegym.vn.service;

import codegym.vn.entity.Nhac;

import java.util.List;

public interface NhacService {
    void create(Nhac nhac);
    void update(String ten, Nhac nhac);
    void delete(String ten);
    List<Nhac> findAll();
    Nhac findByName(String ten);
}
