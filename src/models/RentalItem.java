/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DanPat
 */

@Entity
@Table(name="RENTAL_ITEM", schema="ASD")
@NamedQueries({
    @NamedQuery(query = "Select e from RentalItem e, Customer f where e.customer = f.id and f.id = :id", name = "account.items")
})
public class RentalItem extends Abstract {
      
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String data;
    private String finished;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rentalItemsP", nullable=false)
    private Product product;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rentalItemsC", nullable=false)
    private Customer customer;
    
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setDate(String date)
    {
        this.data=date;
    }
    public String getDate()
    {
        return data;
    }
    public String getFinished()
    {
        return finished;
    }
    public void setFinished(String finish)
    {
        this.finished = finish;
    }
    
  
}