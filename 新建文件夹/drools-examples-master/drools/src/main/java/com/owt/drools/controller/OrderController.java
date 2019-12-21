package com.owt.drools.controller;

import com.owt.drools.service.OrderService;
import org.kie.internal.runtime.cdi.Activate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OrderController {

      @Autowired
      private OrderService orderService;

      @ResponseBody
      @RequestMapping("/add")
      public String pfdj(Integer fs){
            return orderService.fireRule(fs);
      }
}
