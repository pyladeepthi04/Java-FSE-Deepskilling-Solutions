package com.cognizant.springlearn.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

public class CountryService {

    public Country getCountry(String code) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        if(code.equalsIgnoreCase("IN"))
            return (Country) context.getBean("country1");

        if(code.equalsIgnoreCase("US"))
            return (Country) context.getBean("country2");

        if(code.equalsIgnoreCase("JP"))
            return (Country) context.getBean("country3");

        return null;
    }
}