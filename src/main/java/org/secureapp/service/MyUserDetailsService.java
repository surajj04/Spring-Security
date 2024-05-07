package org.secureapp.service;

import org.secureapp.model.User;
import org.secureapp.principal.UserPrincipal;
import org.secureapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("user 404");
		}
		
		return new UserPrincipal(user);
		
	}

}
