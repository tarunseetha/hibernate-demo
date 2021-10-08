package com.learning.hibernatedemo.hibernatedemo.services.impl;

import com.learning.hibernatedemo.hibernatedemo.dto.FormattedOrderResponse;
import com.learning.hibernatedemo.hibernatedemo.dto.OrderRequest;
import com.learning.hibernatedemo.hibernatedemo.dto.OrderResponse;
import com.learning.hibernatedemo.hibernatedemo.entity.Customer;
import com.learning.hibernatedemo.hibernatedemo.repository.OrderRepository;
import com.learning.hibernatedemo.hibernatedemo.services.OrderRequestService;
import com.learning.hibernatedemo.hibernatedemo.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderRequestServiceImpl implements OrderRequestService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Customer customer = new Customer();

        customer.setName(orderRequest.getCustomer().getName());
        customer.setEmailId(orderRequest.getCustomer().getEmailId());
        customer.setProducts(orderRequest.getCustomer().getProducts());

        Customer placedOrder = orderRepository.save(customer);

        return MapperUtils.mapToOrderResponse(placedOrder);
    }

    @Override
    public List<Customer> getAllDetails() {
        return (List<Customer>) orderRepository.findAll();
    }


    @Override
    public List<FormattedOrderResponse> getRecordsUsingJoin() {

        return orderRepository.getRecordsUsingJoin();
    }
}
