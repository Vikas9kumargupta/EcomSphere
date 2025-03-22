package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cart_items")
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemId;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;
    private double discount;
    private double productPrice;

    public Long getCartItemId() {return cartItemId;}
    public void setCartItemId(Long cartItemId) {this.cartItemId = cartItemId;}
    public Cart getCart() {return cart;}
    public void setCart(Cart cart) {this.cart = cart;}
    public Product getProduct() {return product;}
    public void setProduct(Product product) {this.product = product;}
    public Integer getQuantity() {return quantity;}
    public void setQuantity(Integer quantity) {this.quantity = quantity;}
    public double getDiscount() {return discount;}
    public void setDiscount(double discount) {this.discount = discount;}
    public double getProductPrice() {return productPrice;}
    public void setProductPrice(double productPrice) {this.productPrice = productPrice;}
}
