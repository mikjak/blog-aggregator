package pl.jakubmikula.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.jakubmikula.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
