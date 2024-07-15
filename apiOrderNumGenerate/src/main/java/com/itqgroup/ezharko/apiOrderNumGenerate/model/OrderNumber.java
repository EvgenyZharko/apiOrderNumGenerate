package com.itqgroup.ezharko.apiOrderNumGenerate.model;

import java.util.Date;

public class OrderNumber {

    private Long number;
    private Date date;

    public OrderNumber(Long number, Date date) {
        this.number = number;
        this.date = date;
    }

    public OrderNumber() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
