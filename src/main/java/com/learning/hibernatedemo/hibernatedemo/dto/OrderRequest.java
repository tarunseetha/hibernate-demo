package com.learning.hibernatedemo.hibernatedemo.dto;

import com.learning.hibernatedemo.hibernatedemo.entity.Customer;
import lombok.Data;

@Data
public class OrderRequest {

    private Customer customer;
}
