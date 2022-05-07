package spring_project_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_project_sts.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
