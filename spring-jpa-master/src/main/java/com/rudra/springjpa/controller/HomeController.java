package com.rudra.springjpa.controller;

import com.rudra.springjpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private CustomerService customerService;


    /*@RequestMapping(value = "/add", method = RequestMethod.POST)
    public CustomerDetails add(@RequestBody CustomerDetails customer) {

        return customerService.addCustomer(customer);
    }*/

    /*@RequestMapping("/get/{id}")
    public CustomerDetails getCustomerById(@PathVariable Long id) {

        return customerService.getCustomerById(id);
    }

    @PostMapping("/get")
    public List<CustomerDetails> getCustomerByName(@RequestBody CustomerDetailsModel customerModel) {

        return customerService.getCustomerByName(customerModel.getName());
    }

    @RequestMapping("/get-all")
    public List<CustomerDetails> getAllCustomers() {
        return customerService.getCustomers();
    }*/



}
