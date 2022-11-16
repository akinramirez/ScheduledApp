package com.scheduled.cron.ScheduledApp.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronService {

    /*
     https://crontab.cronhub.io/
     https://www.freeformatter.com/cron-expression-generator-quartz.html
     https://www.baeldung.com/spring-scheduled-tasks
     https://stackoverflow.com/questions/38842507/whats-the-difference-between-fixed-rate-and-fixed-delay-in-spring-scheduled-ann#:~:text=fixedRate%20%3A%20makes%20Spring%20run%20the,when%20the%20last%20execution%20finishes.
     https://javahowtos.com/guides/107-spring/321-difference-between-fixedrate-and-fixeddelay-parameter-in-scheduled-in-spring.html
     https://howtodoinjava.com/spring-core/spring-scheduled-annotation/
     */
    @Scheduled(cron = "*/3 * * * * *")
    //@Scheduled(cron = "@hourly")
    public void schedulesTaskUsingCronExpression(){
        long now = System.currentTimeMillis() /1000;
        System.out.println("Scheduled task using cron expression - " +  now);
    }

    @Scheduled(fixedDelay = 3000)
    public void scheduledTaskUsingFixedDelayTask(){
        System.out.println("Fixed delay task - " + System.currentTimeMillis()/1000);
    }

    @Scheduled(cron = "${cron.expression}")
    //@Scheduled(cron = "@hourly")
    public void schedulesTaskUsingCronExpressionWithProperties(){
        long now = System.currentTimeMillis() /1000;
        System.out.println("Scheduled task using cron expression with properties - " +  now);
    }
}
