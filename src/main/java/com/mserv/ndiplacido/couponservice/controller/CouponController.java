package com.mserv.ndiplacido.couponservice.controller;

import com.mserv.ndiplacido.couponservice.model.Coupon;
import com.mserv.ndiplacido.couponservice.service.CouponService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/coupon")
public class CouponController {

    private final CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @GetMapping("/{couponId}")
    public Optional<Coupon> getCouponById(@PathVariable Long couponId) {
        System.out.println("In Get Coupon" + new Date() + "couponId " + couponId);
        return couponService.getCoupon(couponId);
    }

    @PostMapping("/create")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponService.createCoupon(coupon);
    }
}
