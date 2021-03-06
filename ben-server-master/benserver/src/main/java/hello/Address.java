/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String street;
    
    @NotBlank
    private String state;
    
    @NotBlank
    @Size(min=5, max=5)
    @Pattern(regexp = "[0-9]+")
    private String zip;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public String getZip() {
        return zip;
    }
    
    public void setZip(String zip){
        this.zip = zip;
    }
}
