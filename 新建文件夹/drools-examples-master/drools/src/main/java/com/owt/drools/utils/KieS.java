package com.owt.drools.utils;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieS {

    public static KieSession establish(String rule){
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        return  kContainer.newKieSession(rule);
    }
}
