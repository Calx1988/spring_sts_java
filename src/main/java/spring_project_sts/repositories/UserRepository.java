package spring_project_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_project_sts.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
