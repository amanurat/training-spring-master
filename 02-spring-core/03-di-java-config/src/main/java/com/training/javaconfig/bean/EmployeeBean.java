package com.training.javaconfig.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by amanurat on 3/15/2016 AD.
 */

public class EmployeeBean {

    private String firstName;

    private String lastName;

    @Autowired
    private AddressBean addressBean;

    public EmployeeBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public AddressBean getAddressBean() {
        return addressBean;
    }

    public void setAddressBean(AddressBean addressBean) {
        this.addressBean = addressBean;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
