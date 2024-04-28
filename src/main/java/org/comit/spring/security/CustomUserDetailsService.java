package org.comit.spring.security;

import org.comit.spring.bean.User;
import org.comit.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("UserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserDao userdao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = this.userdao.findUser(username);
		
		if (user==null) {
			throw new UsernameNotFoundException("User not found: " + username);
			
		}
		
		return new CustomUserDetails(user);
	}

}
