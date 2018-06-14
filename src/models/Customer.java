/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.Object;
/**
 *
 * @author Rozkurwozaur
 */
@Entity
@Table(name = "CUSTOMER", schema = "ASD")
@XmlRootElement
@NamedQueries({
    
})
public class Customer extends Abstract{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String email;
    @Column(nullable=false)
    private String firstName;
    @Column(nullable=false)
    private String lastName;
    @Column(nullable=false)
    private String login;
    @Column(nullable=false)
    private String haslo;
    @Column
    private boolean active;
    
    public Customer()
    {
        super();
        this.active=false;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setLogin(String login)  {
        this.login = login;
    }
    
    public String getLogin()  {
        return login;
    }
    
    public void setHaslo(String haslo)  {
        this.haslo = haslo;
    }

    public String getHaslo()    {
        return haslo;
    }
    @Override
    public String toString() {
        return "["+getId()+","+firstName+","+lastName+","+email+"]";
    }
}

