package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EasternRestaurant implements Restaurant {

    // 셰프
    private Chef chef;

    // 요리 코스
    private Course course;

    public EasternRestaurant(@Qualifier("kc") Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    // 요리를 주문하는 기능
    @Autowired
    public void order() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();

    }
}
