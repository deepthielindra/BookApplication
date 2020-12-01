package com.bookstore.model.dao;

import java.sql.Connection;

public class DemoMain {

	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		if (connection != null)
			System.out.println("sucess");

		

		/*
		 * BookDao dao=new BookDaoImpl(); dao.updateBook(1,400);
		 */
	}

}
