package com.rudra.springjpa.controller;

import com.rudra.springjpa.service.CustomerService;
import com.rudra.springjpa.entity.CustomerDetails;
import com.rudra.springjpa.model.CustomerDetailsModel;
import com.rudra.springjpa.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     *
     * curl --location --request GET ''curl --location --request POST 'http://localhost:8080/add-customer' \
     * --header 'Content-Type: application/json' \
     * --data-raw '{
     *     "customerDetails":{
     *         "name": "customer 2"
     *     },
     *     "personalDetails": {
     *         "email": "s@s.com",
     *         "mobile": "012345"
     *     }
     * }'
     *
     */
    @RequestMapping(value = "/add-customer", method = RequestMethod.POST)
    public CustomerDetails add(@RequestBody CustomerModel customer) {

        return customerService.addCustomer(customer);
    }

    @RequestMapping("/get/{id}")
    public CustomerModel getCustomerById(@PathVariable Long id) {

        return customerService.getCustomerById(id);
    }

    @PostMapping("/get")
    public List<CustomerModel> getCustomerByName(@RequestBody CustomerDetailsModel customerModel) {

        return customerService.getCustomerByName(customerModel.getName());
    }

    @RequestMapping("/get-all")
    public List<CustomerModel> getAllCustomers() {
        return customerService.getCustomers();
    }

    /**
     * Tasks
     * -----
     * 1) Implement one to many relationship using JPA
     * 2) Instead of saving Student & Employee information as Collections, create entity classes and save them into database
     * 3) Create a sample project using MySQL
     */

}
