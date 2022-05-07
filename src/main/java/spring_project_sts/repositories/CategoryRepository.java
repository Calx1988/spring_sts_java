package spring_project_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_project_sts.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
