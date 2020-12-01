package com.bookstore.model.dao.book.user;

public class UserDemoMain {
	public static void main(String[] args) {
		UserDao dao=new UserDaoImpl();
		
		User user=new User("Ekta", "Ektha123", "emp");
		dao.addUser(user);
		
		
	}
}
