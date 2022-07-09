package codegym.vn.service;

import codegym.vn.entity.Nhac;
import codegym.vn.reponsitory.NhacReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhacServiceImpl implements NhacService{

    @Autowired
    private NhacReponsitory nhacReponsitory;

    @Override
    public void create(Nhac nhac) {
        nhacReponsitory.create(nhac);
    }

    @Override
    public void update(String ten, Nhac nhac) {
        nhacReponsitory.update(nhac);
    }

    @Override
    public void delete(String ten) {
        nhacReponsitory.delete(ten);
    }

    @Override
    public List<Nhac> findAll() {
        return nhacReponsitory.findAll();
    }

    @Override
    public Nhac findByName(String ten) {
        return null;
    }
}
