package pl.jakubmikula.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.jakubmikula.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
