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
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		User user = this.userdao.findUser(userName);
		
		if (user==null) {
			throw new UsernameNotFoundException("User not found: " + userName);
			
		}
		
		return new CustomUserDetails(user);
	}

}
