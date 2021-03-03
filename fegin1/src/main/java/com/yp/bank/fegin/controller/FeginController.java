package com.yp.bank.fegin.controller;
/**
 * @author pan
 * @date 2021/3/3 21:28
 */

import com.yp.bank.fegin.Service.IFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : com.yp.bank.fegin.controller.FeginController
 * @Description : 类描述
 * @author pan
 * @date 2021/3/3 21:28
 */
@RestController
@RequestMapping("app/bank/fegin")
public class FeginController {
    @Autowired
    public IFeginService iFeginService;

    @GetMapping("/whoIs.do")
    public String WhoIs(){
        return  iFeginService.who();
    }
}
