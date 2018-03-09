/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ben
 */
@Controller
public class AddressController {
    
    @GetMapping(value = "address")
    public String showForm(Model model) {
        model.addAttribute("address", new Address());
        return "address";
    }

    @PostMapping(value = "/submit")
    public String submit(@ModelAttribute(value="address")Address address, Model model){
        
        return "submit";
    }
    
    @RequestMapping(value = "list")
    public String showList(@ModelAttribute(value="address") Address address){
        
        return "list";
    }
}

