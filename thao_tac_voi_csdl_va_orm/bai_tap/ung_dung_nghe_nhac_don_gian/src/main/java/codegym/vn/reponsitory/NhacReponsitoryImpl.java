package codegym.vn.reponsitory;

import codegym.vn.entity.Nhac;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
 // @Transactional
public class NhacReponsitoryImpl implements NhacReponsitory{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Nhac nhac) {
            entityManager.persist(nhac);
    }

    @Override
    public void update(Nhac nhac) {
        entityManager.merge(nhac);

    }

    @Override
    public void delete(String ten) {
        Nhac nhac = findByName(ten);
        entityManager.remove(nhac);
    }

    @Override
    public List<Nhac> findAll() {
        List<Nhac> nhacList = entityManager
                .createQuery("select n from Nhac n")
                .getResultList();
        return nhacList;
    }

    @Override
    public Nhac findByName(String ten) {
        return entityManager.find(Nhac.class, ten);    }
}
