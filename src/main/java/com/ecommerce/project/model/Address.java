package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 2, message = "Street names should be at least 5 letters")
    private Long street;

    @NotBlank
    @Size(min = 2, message = "Building names should be at least 5 letters")
    private Long building_name;

    @NotBlank
    @Size(min = 2, message = "city names should be at least 5 letters")
    private Long city;

    @NotBlank
    @Size(min = 2, message = "statement names should be at least 5 letters")
    private Long state;

    @NotBlank
    @Size(min = 5, message = "statement names should be at least 5 letters")
    private Long country;

    @NotBlank
    @Size(min = 6, message = "Enter 6 digit Pin-code")
    private Long pin_code;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> user = new ArrayList<>();

    public Address(Long addressId, Long street, Long building_name, Long city, Long state, Long country, Long pin_code) {
        this.addressId = addressId;
        this.street = street;
        this.building_name = building_name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin_code = pin_code;
    }
}
