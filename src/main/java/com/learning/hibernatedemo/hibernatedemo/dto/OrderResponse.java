package com.learning.hibernatedemo.hibernatedemo.dto;

import lombok.Data;

@Data
public class OrderResponse {

    private String status;
    private String message;

    public static String STATUS_SUCCESS = "SUCCESS";
    public static String STATUS_FAILURE = "FAILURE";
    public static String MESSAGES_FAILURE = "Sorry your order could not placed. Please try later.";
    public static String MESSAGES_SUCCESS = "Congratulations !! Your order has been placed successfully.";
}
