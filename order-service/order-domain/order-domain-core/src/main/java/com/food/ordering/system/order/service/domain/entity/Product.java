package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.order.service.domain.valueobject.Money;
import com.food.ordering.system.order.service.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {

    private String name;
    private Money price;


    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public Product(ProductId id) {
        super.setId(id);
    }

    public void updateWithConfirmedNameAndPrice(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
