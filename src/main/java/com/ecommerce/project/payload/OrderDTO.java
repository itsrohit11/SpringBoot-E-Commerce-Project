package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderDTO  {

    private Long orderId;
    private String email;
    private List<OrderItemDTO> orderItems;
    private PaymentDTO payment;
    private double totalAmount;
    private String orderStatus;
    private Long addressId;
}
