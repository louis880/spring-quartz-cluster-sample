package net.aimeizi.quartz.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestJobController {

    @RequestMapping(value = "test1", method = RequestMethod.GET)
        public void test1() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("MMMMMMMM");
    }

    @Scheduled(cron="0/2 * * * * ?")
    public void test2() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("MMMMMMMM");
    }

}
