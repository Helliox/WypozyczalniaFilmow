/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DanPat
 */

@Entity
@Table(name="PRODUCT", schema="APP")
public class Product extends Abstract {
    
    
    @Id private Long id;
    private String title;
    private Double price;
    private String states;

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
     @Override
    public String toString() {
        return "["+getId()+","+title+","+price;
    }
}
