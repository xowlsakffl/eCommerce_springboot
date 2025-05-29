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
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 1, message = "주소 이름은 최소 1자 이상이여야합니다.")
    private String title; // 전체 주소

    @NotBlank
    @Size(min = 5, message = "전체 주소는 최소 5자 이상이여야합니다.")
    private String addressName; // 전체 주소

    @NotBlank
    @Size(min = 2, message = "도로명 주소는 최소 2자 이상이여야합니다.")
    private String roadNameAddress; // 도로명 주소

    @NotBlank
    @Size(min = 2, message = "지번 주소는 최소 2자 이상이여야합니다.")
    private String jibunAddress; // 지번 주소

    @NotBlank
    @Size(min = 4, message = "우편번호는 최소 4자 이상이여야합니다.")
    private String postalCode; // 우편번호

    @NotBlank
    @Size(min = 2, message = "위도는 최소 2자 이상이여야합니다.")
    private String latitude; // 위도

    @NotBlank
    @Size(min = 2, message = "경도는 최소 2자 이상이여야합니다.")
    private String longitude; // 경도

    @NotBlank
    @Size(min = 2, message = "건물명은 최소 2자 이상이여야합니다.")
    private String buildingName; // 건물명

    @NotBlank
    @Size(min = 2, message = "시/도는 최소 2자 이상이여야합니다.")
    private String region1DepthName; // 시/도

    @NotBlank
    @Size(min = 2, message = "시/군/구는 최소 2자 이상이여야합니다.")
    private String region2DepthName; // 시/군/구

    @NotBlank
    @Size(min = 2, message = "읍/면/동은 최소 2자 이상이여야합니다.")
    private String region3DepthName; // 읍/면/동

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String addressName, String roadNameAddress, String jibunAddress, String postalCode, String latitude, String longitude, String buildingName, String region1DepthName, String region2DepthName, String region3DepthName) {
        this.addressName = addressName;
        this.roadNameAddress = roadNameAddress;
        this.jibunAddress = jibunAddress;
        this.postalCode = postalCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.buildingName = buildingName;
        this.region1DepthName = region1DepthName;
        this.region2DepthName = region2DepthName;
        this.region3DepthName = region3DepthName;
    }
}
