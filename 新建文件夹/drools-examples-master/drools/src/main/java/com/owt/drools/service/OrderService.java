package com.owt.drools.service;

import com.owt.drools.entity.Order;
import com.owt.drools.utils.KieS;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String fireRule(Integer fs){
        KieSession ksession = KieS.establish("js");
        Order order = new Order();
        order.setFs(fs);
        ksession.insert(order);
        ksession.fireAllRules();
        return order.getNews().toString();
    }


}
