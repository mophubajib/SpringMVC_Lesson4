package com.spring.mvc.controller;

import com.spring.mvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("")
    public String homeCustomer() {

        return "customer/home";
    }

    @RequestMapping("/create")
    public String createCustomer(Model model) {

        model.addAttribute("modelCustomer", new Customer());
        return "customer/create";
    }

    @RequestMapping("/get")
    public String getCustomer(@Valid @ModelAttribute("modelCustomer") Customer customer,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "customer/create";
        } else {
            return "customer/get";
        }
    }
}
