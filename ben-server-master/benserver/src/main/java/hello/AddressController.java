/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ben
 */
@Controller
public class AddressController {
    
    @RequestMapping(value = "address", method = RequestMethod.GET)
    public String address() {
        return "address";
    }
    
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String addAddress(@Valid @ModelAttribute("address") Address address,
            BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "index";
        }
        model.addAttribute("name", address.getName());
        model.addAttribute("street", address.getStreet());
        model.addAttribute("state", address.getState());
        model.addAttribute("zip", address.getZip());
        return "submit";
    }

}
