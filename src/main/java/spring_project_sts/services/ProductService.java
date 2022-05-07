package spring_project_sts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_project_sts.entities.Product;
import spring_project_sts.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.get();
    }
}
