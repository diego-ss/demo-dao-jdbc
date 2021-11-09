package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
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
		
		System.out.println("\n=== TEST 4: seller insert =====");
		seller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.0, new Department(2, null));
		//sellerDao.insert(seller);
		System.out.println("Inserted! New id = " + seller.getId());
		
		System.out.println("\n=== TEST 5: seller update =====");
		seller = sellerDao.findById(3);
		seller.setName("Alex Blue");
		//sellerDao.update(seller);
		System.out.println("Seller updated!");
		
		System.out.println("\n=== TEST 6: seller delete =====");
		sellerDao.deleteById(10);
		System.out.println("Seller deleted!");
	}

}
