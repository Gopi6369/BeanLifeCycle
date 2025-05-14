package com.example.Spring_BeanLifeCycleEx.Controller;

import com.example.Spring_BeanLifeCycleEx.Service.BeanLifecycleService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleController {

    private final BeanLifecycleService beanLifecycleService;

    @Autowired
    public BeanLifecycleController(BeanLifecycleService beanLifecycleService) {
        this.beanLifecycleService = beanLifecycleService;
    }

    public String getController() {
        return beanLifecycleService.getVehicle();
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialization!!!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroy!!");
    }
}

