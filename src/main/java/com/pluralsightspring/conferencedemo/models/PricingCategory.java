package com.pluralsightspring.conferencedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.text.DateFormat;

@Entity(name = "pricing_categories")

public class PricingCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String pricing_category_code;

    private String getPricing_category_name;
    private DateFormat pricing_start_date;
    private DateFormat pricing_end_date;



    public PricingCategory() {
    }
}
