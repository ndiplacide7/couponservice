package com.mserv.ndiplacido.couponservice.service;

import com.mserv.ndiplacido.couponservice.model.Coupon;
import com.mserv.ndiplacido.couponservice.repository.CouponReposotory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Slf4j
@Service
public class CouponService {
    private final CouponReposotory couponReposotory;

    public CouponService(CouponReposotory couponReposotory) {
        this.couponReposotory = couponReposotory;
    }

    public Optional<Coupon> getCoupon(Long couponId){
        log.info("In Get Coupon" + new Date() + "couponId "+couponId);
        return couponReposotory.findById(couponId);
    }
    public Coupon createCoupon(Coupon coupon){
        return couponReposotory.save(coupon);
    }

}

