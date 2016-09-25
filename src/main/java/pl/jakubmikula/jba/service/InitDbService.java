package pl.jakubmikula.jba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jakubmikula.jba.entity.Blog;
import pl.jakubmikula.jba.entity.Item;
import pl.jakubmikula.jba.entity.Role;
import pl.jakubmikula.jba.entity.User;
import pl.jakubmikula.jba.repository.BlogRepository;
import pl.jakubmikula.jba.repository.ItemRepository;
import pl.jakubmikula.jba.repository.RoleRepository;
import pl.jakubmikula.jba.repository.UserRepository;

@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostConstruct
	public void init() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);

		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogJavavids = new Blog();
		blogJavavids.setName("JavaVids");
		blogJavavids.setUrl("http://feeds.feedburner.com/javavids?format=xml");
		blogJavavids.setUser(userAdmin);
		blogRepository.save(blogJavavids);
		
		Item item1 = new Item();
		item1.setTitle("Item 1");
		item1.setDescription("Item 1 description");
		item1.setLink("http://www.javavids.com");
		item1.setPublishedDate(new Date());
		item1.setBlog(blogJavavids);
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setTitle("Item 2");
		item2.setDescription("Item 2 description");
		item2.setLink("http://www.javavids.com");
		item2.setPublishedDate(new Date());
		item2.setBlog(blogJavavids);
		itemRepository.save(item2);
		
		
		
		
		
		
	}
}
