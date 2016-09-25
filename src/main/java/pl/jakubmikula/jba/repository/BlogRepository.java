package pl.jakubmikula.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.jakubmikula.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
