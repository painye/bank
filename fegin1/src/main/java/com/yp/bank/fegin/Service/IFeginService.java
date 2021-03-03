package com.yp.bank.fegin.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pan
 * @date 2021/3/3 21:26
 */

@FeignClient(value = "counter")
public interface IFeginService {
    @GetMapping("app/bank/counter/who.do")
    public String who();
}
