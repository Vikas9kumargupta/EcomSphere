package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="addresses")
@Data
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Size(min = 5, message = "Street name must be at-least 5 characters")
    @NotBlank
    private String street;


    @Size(min = 5, message = "Building name must be at-least 5 characters")
    @Column(name = "building_name")
    @NotBlank
    private String buildingName;

    @Size(min = 4, message = "City name must be at-least 4 characters")
    @NotBlank
    private String city;

    @Size(min = 2, message = "State name must be at-least 3 characters")
    @NotBlank
    private String state;

    @Size(min = 2, message = "Country name must be at-least 2 characters")
    @NotBlank
    private String country;

    @Size(min = 6, message = "PinCode must be at-least 6 characters")
    @Column(name = "pincode")
    @NotBlank
    private String pinCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(){}
    public Long getAddressId() { return addressId;}
    public void setAddressId(Long addressId) { this.addressId = addressId; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getBuildingName() { return buildingName; }
    public void setBuildingName(String buildingName) { this.buildingName = buildingName; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getPinCode() { return pinCode; }
    public void setPinCode(String pinCode) { this.pinCode = pinCode;}
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user;}
    public Address(String street, String buildingName, String city, String state, String country, String pinCode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}
