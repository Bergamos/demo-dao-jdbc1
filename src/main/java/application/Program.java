package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        var obj = new Department(1, "Books");

        var seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);




    }

}
