/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author DanPat
 */

@Entity
@Table(name="RENTAL_ITEM", schema="ASD")
public class RentalItem extends Abstract {
      
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    //@ManyToOne
    private Product product;
    @ManyToOne
    private Rental rental;
      
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }
    
  
}
