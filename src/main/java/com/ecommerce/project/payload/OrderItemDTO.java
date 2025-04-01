package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderItemDTO {
    private Long orderItemId;
    private Integer quantity;
    private double discount;
    private ProductDTO product;
    private double orderedProductPrice;
}
