package codegym.vn.reponsitory;


import codegym.vn.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProductReponsitoryImpl implements ProducrReponsitory{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        List<Product> productList = entityManager
                .createQuery("select n from Product n")
                .getResultList();
        return productList;    }

    @Override
    public void save(Product product) {
        entityManager.persist(product);

    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }



    @Override
    public void remove(int id) {
        Product product = findById(id);
        entityManager.remove(product);
    }

    @Override
    public void update(int id, Product product) {
        entityManager.merge(product);

    }

/*
    @Override
    public void create(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void update(Product product) {
        entityManager.merge(product);

    }

    @Override
    public void delete(String name) {
        Product product = findByName(name);
        entityManager.remove(product);
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = entityManager
                .createQuery("select n from Product n")
                .getResultList();
        return productList;
    }

    @Override
    public Product findByName(String name) {
        return entityManager.find(Product.class, name);    }
*/
}
