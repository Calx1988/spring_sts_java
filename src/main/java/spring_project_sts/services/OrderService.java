package spring_project_sts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_project_sts.entities.Order;
import spring_project_sts.entities.User;
import spring_project_sts.repositories.OrderRepository;
import spring_project_sts.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        return optionalOrder.get();
    }
}
