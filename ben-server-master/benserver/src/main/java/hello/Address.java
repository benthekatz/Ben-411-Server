/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author Ben
 */
public class Address {

    private String name;
    private String street;
    private String state;
    private String zip;

    public Address() {
        
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
