package spring_project_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_project_sts.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
