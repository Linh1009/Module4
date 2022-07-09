package codegym.vn.reponsitory;

import codegym.vn.entity.Nhac;

import java.util.List;

public interface NhacReponsitory {
    void create(Nhac nhac);
    void update(Nhac nhac);
    void delete(String ten);
    List<Nhac> findAll();
    Nhac findByName(String ten);
}
