package spring_project_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_project_sts.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
