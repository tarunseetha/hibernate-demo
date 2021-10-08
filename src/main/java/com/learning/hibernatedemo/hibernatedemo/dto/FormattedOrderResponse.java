package com.learning.hibernatedemo.hibernatedemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormattedOrderResponse {

    private String customerName;
    private String productName;
}
