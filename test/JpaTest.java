/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jpaDAO.CustomerJpaDao;
import jpaDAO.ProductJpaDao;
import jpaDAO.RentalItemJpaDao;
import models.Customer;
import models.Product;
import models.RentalItem;
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
    
}
