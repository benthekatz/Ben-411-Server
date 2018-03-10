/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import hello.Address;
import hello.AddressRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ben
 */
@Controller
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping(value = "address")
    public String showForm(Model model) {
        model.addAttribute("address", new Address());
        return "address";
    }

    @PostMapping(value = "/submit")
    public String submit(@Valid @ModelAttribute(value = "address") Address address, BindingResult bindingResult) {
        
        if(bindingResult.hasErrors()){
            return "address";
        } 
        
        Address n = new Address();
        n.setName(address.getName());
        n.setStreet(address.getStreet());
        n.setState(address.getState());
        n.setZip(address.getZip());
        addressRepository.save(n);
        
        return "submit";
    }

    @GetMapping(path = "/list")
    public @ResponseBody
    Iterable<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
}
