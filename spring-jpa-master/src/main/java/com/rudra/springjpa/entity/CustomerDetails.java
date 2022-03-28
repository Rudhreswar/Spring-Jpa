package com.rudra.springjpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private PersonalDetails personalDetails;

    public CustomerDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
}

