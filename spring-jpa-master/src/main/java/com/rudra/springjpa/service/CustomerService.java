package com.rudra.springjpa.service;

import com.rudra.springjpa.entity.CustomerDetails;
import com.rudra.springjpa.entity.PersonalDetails;
import com.rudra.springjpa.model.CustomerDetailsModel;
import com.rudra.springjpa.model.CustomerModel;
import com.rudra.springjpa.model.PersonalDetailsModel;
import com.rudra.springjpa.repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerDetailsRepository customerRepository;



    //Get the Customer Model details ..........................................................

    private CustomerModel getCustomerModel(CustomerDetails customerDetails) {

        CustomerModel customerModel = new CustomerModel();
        CustomerDetailsModel customerDetailsModel = new CustomerDetailsModel();
        customerDetailsModel.setName(customerDetails.getName());

        PersonalDetailsModel personalDetailsModel = new PersonalDetailsModel();
        personalDetailsModel.setMobile(customerDetails.getPersonalDetails().getMobile());
        personalDetailsModel.setEmail(customerDetails.getPersonalDetails().getEmail());

        customerModel.setCustomerDetails(customerDetailsModel);
        customerModel.setPersonalDetails(personalDetailsModel);
        return customerModel;
    }



    // Get  All Customers details .......................................................................


    public List<CustomerModel> getCustomers() {
        List<CustomerDetails> customDetails = customerRepository.findAll();
        return customDetails.stream().map(customer -> getCustomerModel(customer)).collect(Collectors.toList());
    }



    // Get the Customer details by ID ..................................................................

    public CustomerModel getCustomerById(Long id) {
        Optional<CustomerDetails> customerDetails = customerRepository.findById(id);
        if (customerDetails.isPresent()) {
            return getCustomerModel(customerDetails.get());
        }
        return null;
    }


    // Get the details Of Customer by name .....................................................

    public List<CustomerModel> getCustomerByName(String name) {
        List<CustomerDetails> customDetails = customerRepository.findByName(name);
        return customDetails.stream().map(customer -> getCustomerModel(customer)).collect(Collectors.toList());
    }


    // Adding the customer details ............................................................

    public CustomerDetails addCustomer(CustomerModel customer) {

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setName(customer.getCustomerDetails().getName());

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setMobile(customer.getPersonalDetails().getMobile());
        personalDetails.setEmail(customer.getPersonalDetails().getEmail());
        customerDetails.setPersonalDetails(personalDetails);

        return customerRepository.save(customerDetails);
    }


}
