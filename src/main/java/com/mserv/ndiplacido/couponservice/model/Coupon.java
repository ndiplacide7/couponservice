package com.mserv.ndiplacido.couponservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long couponId;
    private String couponCode;
    private Double couponDiscount;
//    private String couponType;
//    private String couponStatus;
//    private String couponMessage;
    private String couponExpiryDate;
//    private String couponCreateDate;
//    private String couponUpdateDate;
//    private Long couponUserId;
}
