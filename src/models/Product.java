/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DanPat
 */

@Entity
@Table(name="PRODUCT", schema="ASD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(query = "Select e from Product e where e.title = :title", name = "product.title"),
    @NamedQuery(query = "Select count(*) from Product", name="product.count")
})
public class Product extends Abstract {   
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String title;
    @Column(nullable=false)
    private Double price;
    @Column(nullable=false)
    private String states;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "product")
    private List<RentalItem> rentalItemsP;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }
    public List<RentalItem> getRentalItems() {
        return rentalItemsP;
    }

    public void setVisitD(List<RentalItem> rentalItems) {
        this.rentalItemsP = rentalItems;
    }
     @Override
    public String toString() {
        return "["+getId()+","+title+","+price+"]";
    }
    @Override
    public void setId(Long id)
    {
        this.id=id;
    }
    @Override
    public Long getId()
    {
        return id;
    }
}
