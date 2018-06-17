/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DanPat
 */

@Entity
@Table(name="RENTAL", schema="ASD")
public class Rental extends Abstract {
      
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Timestamp data;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rental", nullable=false)
    private Customer customer;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "rental")
    private List<RentalItem> rentalItemsR;

    public Timestamp getDate() {
        return data;
    }

    public void setDate(Timestamp data) {
        this.data=data;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public void addRentalItem(RentalItem pi) {
        rentalItemsR.add(pi);
        pi.setRental(this);
    }

    public List<RentalItem> getPurchaseItems() {
        return rentalItemsR;
    }

}
