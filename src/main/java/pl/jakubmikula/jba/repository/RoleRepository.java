package pl.jakubmikula.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.jakubmikula.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
