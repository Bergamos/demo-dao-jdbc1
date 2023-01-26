package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        var obj = new Department(1, "Books");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: Seller findById");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }

}
