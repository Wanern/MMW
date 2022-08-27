package com.wanern.mmw.member.feign;

import com.wanern.mmw.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ale on 2022/8/25
 */
@FeignClient("mmw-coupon-service")
public interface CouponFeignService {


    @RequestMapping(value = "/coupon/coupon/member/coupon/list/{id}", method = RequestMethod.GET)
    R memberCouponList(@PathVariable long id);

}
