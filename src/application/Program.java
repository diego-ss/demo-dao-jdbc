package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		var sellers = sellerDao.findByDepartment(1);
		for(Seller obj : sellers) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3: seller findAll =====");
		sellers = sellerDao.findAll();
		for(Seller obj : sellers) {
			System.out.println(obj);
		}
	}

}
