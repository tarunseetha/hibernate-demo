package com.learning.hibernatedemo.hibernatedemo.utils;

import com.learning.hibernatedemo.hibernatedemo.dto.OrderResponse;
import com.learning.hibernatedemo.hibernatedemo.entity.Customer;

/**
 * A utility class to map response output DTO fields.
 *
 * @author - Tarun Seetha
 * @version - 1.0.0
 */
public class MapperUtils {

    /**
     * To map response DTO fields to throw success / failure response after order place request.
     *
     * @param customer - Instance of {@link Customer}
     * @return - Instance of {@link OrderResponse}
     */
    public static OrderResponse mapToOrderResponse(Customer customer) {

        OrderResponse orderResponse = new OrderResponse();

        if (customer.getId() != null) {
            orderResponse.setStatus(OrderResponse.STATUS_SUCCESS);
            orderResponse.setMessage(OrderResponse.MESSAGES_SUCCESS);
        } else {
            orderResponse.setStatus(OrderResponse.STATUS_FAILURE);
            orderResponse.setMessage(OrderResponse.MESSAGES_FAILURE);
        }
        return orderResponse;
    }
}
