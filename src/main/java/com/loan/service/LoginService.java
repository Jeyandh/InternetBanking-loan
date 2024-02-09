package com.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.bean.Login;
import com.loan.bean.User;
import com.loan.repository.UserRepo;

@Service
public class LoginService {

	@Autowired
	UserRepo repo;
	User user;

	public Login login(User user) {
		User ref = repo.findByUserEmail(user.getUserEmail());
		User pass = repo.findByPassword(user.getPassword());
		if (ref != null && pass != null) {
			String value = ref.getPassword();
			String word = pass.getPassword();
			if (value.equals(word)) {
				String res = ref.getUserType();
				if (res.equalsIgnoreCase("admin")) {
					return new Login("Admin Success");
				} else {
					return new Login("User Success");
				}
			} else {
				return new Login("Login Fail");
			}
		} else {
			return new Login("Login Fail");
		}

	}
}
