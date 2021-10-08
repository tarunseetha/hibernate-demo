package com.learning.hibernatedemo.hibernatedemo.controllers;

import com.learning.hibernatedemo.hibernatedemo.dto.FormattedOrderResponse;
import com.learning.hibernatedemo.hibernatedemo.dto.OrderRequest;
import com.learning.hibernatedemo.hibernatedemo.dto.OrderResponse;
import com.learning.hibernatedemo.hibernatedemo.entity.Customer;
import com.learning.hibernatedemo.hibernatedemo.services.OrderRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderRequestService orderRequestService;

    @PostMapping("/placeOrder")
    public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest) {

        return orderRequestService.placeOrder(orderRequest);
    }

    @GetMapping("/getAllRecords")
    public List<Customer> getAllCustomerAndProductDetails() {
        return orderRequestService.getAllDetails();
    }

    @GetMapping("/joinQueryDemo")
    public List<FormattedOrderResponse> getRecordsUsingJoin() {
        return orderRequestService.getRecordsUsingJoin();
    }
}
