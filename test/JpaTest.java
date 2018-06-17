/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jpaDAO.CustomerJpaDao;
import jpaDAO.ProductJpaDao;
import jpaDAO.RentalItemJpaDao;
import jpaDAO.RentalJpaDao;
import jpaDAO.WorkerJpaDao;
import models.Customer;
import models.Product;
import models.Rental;
import models.RentalItem;
import models.Worker;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Dan
 */
public class JpaTest {
    
    public JpaTest() {
    }
   
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {}
    
    @Test
    public void testCreateCustomer() {
        System.out.println("createCustomer");
        CustomerJpaDao cdao = new CustomerJpaDao();
        Customer customer = new Customer();
        assert customer != null;
    }
    @Test
    public void testFindByLoginCustomer() {
        System.out.println("findCustomer");
        String login = "dan";
        String pass = "pass";
        CustomerJpaDao cdao = new CustomerJpaDao();
        Customer customer = new Customer();
        customer.setLogin(login);
        customer.setHaslo(pass);           
        customer.setFirstName("nowy");
        customer.setLastName("stary");
        customer.setEmail("dan@ds.pl");
        cdao.save(customer);
        Customer customer2 = cdao.findByLogin(login,pass);
        assertEquals(customer2.getLogin(), customer.getLogin());
    }
    @Test
    public void testCreateProduct() {
        System.out.println("createProduct");
        ProductJpaDao pdao = new ProductJpaDao();
        Product product = new Product();
        assert product != null;
    }
    @Test
    public void testfindByNameProd() {
        System.out.println("findProduct");
        String title = "deska";
        ProductJpaDao pdao = new ProductJpaDao();
        Product product = new Product();
        product.setTitle(title);
        product.setStates("dostepny");
        product.setPrice(200.00);
        pdao.save(product);
        Product product2 = pdao.findByName(title);
        assertEquals(product2.getTitle(),product.getTitle());
    }
    @Test
    public void testCreateWorker() {
        System.out.println("createWorker");
        WorkerJpaDao pdao = new WorkerJpaDao();
        Worker worker = new Worker();
        assert worker != null;
    }
    @Test
    public void testFindByLoginWorker() {
        System.out.println("findWorker");
        String login = "lukas";
        String pass = "pass";
        WorkerJpaDao wdao = new WorkerJpaDao();
        Worker worker = new Worker();
        worker.setLogin(login);
        worker.setPassword(pass);           
        worker.setFirstName("lukas");
        worker.setLastName("zieba");
        worker.setEmail("zieba@ds.pl");
        wdao.save(worker);
        Worker worker2 = wdao.findByLogin(login,pass);
        assertEquals(worker2.getLogin(), worker.getLogin());
    }
    @Test
    public void testCreateRentalItem() {
        System.out.println("createRentalItem");
        RentalItem rentalitem = new RentalItem();
        assert rentalitem != null;
    }
        @Test
    public void testCreateRentalItem2() {
        System.out.println("createRentalItem2");
        RentalItem rentalitem = new RentalItem();
        RentalItem rentalitem2 = new RentalItem();
        Product product = new Product();
        rentalitem.setProduct(product);
        rentalitem2.setProduct(product);
        assert rentalitem.getProduct() == rentalitem.getProduct();
    }
    @Test
    public void testCreateRental() {
        System.out.println("createRental");
        Rental rental = new Rental();
        assert rental != null;
    }
    @Test
    public void testCreateRental2() {
        System.out.println("createRental2");
        Rental rental = new Rental();
        RentalItem rentalitem = new RentalItem();
        Product product = new Product();
        product.setTitle("kieszen");
        product.setStates("dostepny");
        product.setPrice(200.00);
        rentalitem.setProduct(product);
        rental.addRentalItem(rentalitem);
        rental.addRentalItem(rentalitem);
        assert rental.getPurchaseItems().get(0) == rental.getPurchaseItems().get(1);
    }
    @Test
    public void testCreateRental3() {
        System.out.println("createRental3");
        Rental rental = new Rental();
        RentalItem rentalitem = new RentalItem();
        RentalItem rentalitem2= new RentalItem();
        Product product = new Product();
        product.setTitle("kieszen");
        product.setStates("dostepny");
        product.setPrice(200.00);
        Product product2 = new Product();
        product2.setTitle("spodnie");
        product2.setStates("dostepny");
        product2.setPrice(10.00);
        rentalitem.setProduct(product);
        rental.addRentalItem(rentalitem);
        rentalitem2.setProduct(product2);
        rental.addRentalItem(rentalitem2);
        assert rental.getPurchaseItems().get(0) != rental.getPurchaseItems().get(1);
    }
}
