package codegym.vn.sevice.impl;


import codegym.vn.entity.Product;
import codegym.vn.reponsitory.ProductReponsitoryImpl;
import codegym.vn.sevice.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductReponsitoryImpl productReponsitory = new ProductReponsitoryImpl();

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void save(Product product) {

    }
}
  /*  @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public void save(Product product) {
        productReponsitory.save(product);

    }

    @Override
    public Product findById(int id) {
        return productReponsitory.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productReponsitory.update(id, product);
    }

    @Override
    public void remove(int id) {
        productReponsitory.remove(id);
    }
}
*/