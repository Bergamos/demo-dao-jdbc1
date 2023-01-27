package application;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: Department findAll ===");
        List<Department> list = departmentDao.findAll();

        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("\n=== TEST 2: Department findById ===");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("\n=== TEST 3: Department insert ===");
        Department newDep = new Department(null, "Food");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New department id: " + newDep.getId());

        System.out.println("\n=== TEST 4: Department update ===");
        dep = departmentDao.findById(6);
        dep.setName("Tools");
        departmentDao.update(dep);
        System.out.println("Update Success!");

        System.out.println("\n=== TEST 5: Department delete ===");
        System.out.print("Enter the department to be deleted: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Completed!");
        sc.close();


    }
}
