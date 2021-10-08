package com.learning.hibernatedemo.hibernatedemo.services;

import com.learning.hibernatedemo.hibernatedemo.dto.FormattedOrderResponse;
import com.learning.hibernatedemo.hibernatedemo.dto.OrderRequest;
import com.learning.hibernatedemo.hibernatedemo.dto.OrderResponse;
import com.learning.hibernatedemo.hibernatedemo.entity.Customer;

import java.util.List;

/**
 * Interface to place order
 *
 * @author - Tarun Seetha
 * @version - 1.0.0
 */
public interface OrderRequestService {


    /**
     * To place an order for a customer.
     *
     * @param orderRequest - Instance of {@link OrderRequest}
     * @return - Instance of {@link OrderResponse}
     */
    OrderResponse placeOrder(OrderRequest orderRequest);

    /**
     * s
     * To return list of all customer and associated product details
     *
     * @return - Instance of {@link Customer}
     */
    List<Customer> getAllDetails();


    List<FormattedOrderResponse> getRecordsUsingJoin();
}
