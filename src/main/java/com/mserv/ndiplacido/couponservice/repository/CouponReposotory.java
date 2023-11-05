package com.mserv.ndiplacido.couponservice.repository;

import com.mserv.ndiplacido.couponservice.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponReposotory extends JpaRepository<Coupon,Long> {
}
