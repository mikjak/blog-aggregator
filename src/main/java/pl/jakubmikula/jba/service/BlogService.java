package pl.jakubmikula.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jakubmikula.jba.entity.Blog;
import pl.jakubmikula.jba.entity.User;
import pl.jakubmikula.jba.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
//	public List<Blog> findAllByUser(User user) {
//		
//		return blogRepository.findAllByUser(user);
//	}
	
}
