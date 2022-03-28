package com.rudra.springjpa.model;

public class CustomerModel {

    private CustomerDetailsModel customerDetails;
    private PersonalDetailsModel personalDetails;

    public CustomerDetailsModel getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetailsModel customerDetails) {
        this.customerDetails = customerDetails;
    }

    public PersonalDetailsModel getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetailsModel personalDetails) {
        this.personalDetails = personalDetails;
    }

}
