package com.ecommerce.project.model;

import com.ecommerce.project.payload.CategoryDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Table(name = "products")
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @NotBlank
    @Size(min = 3, message = "Product name must contain at-least 3 characters")
    private String productName;
    private String image;

    @NotBlank
    @Size(min = 6, message = "Product description must contain at-least 6 characters")
    private String description;
    private Integer quantity;
    private double price;
    private double discount;
    private  double specialPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<CartItem> products = new ArrayList<>();

    public List<CartItem> getProducts() {return products;}
    public void setProducts(List<CartItem> products) {this.products = products;}
    public Product(){}
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user;}
    public Long getProductId() {return productId;}
    public void setProductId(Long productId) {this.productId = productId;}
    public String getProductName() {return productName;}
    public void setProductName(String productName) {this.productName = productName;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public Integer getQuantity() {return quantity;}
    public void setQuantity(Integer quantity) {this.quantity = quantity;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public double getSpecialPrice() {return specialPrice;}
    public void setSpecialPrice(double specialPrice) {this.specialPrice = specialPrice;}
    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}
    public double getDiscount(){return discount;}
    public void setDiscount(double discount){this.discount = discount;}
    public String getImage() {return image;}
    public void setImage(String image) {this.image = image;}
}
