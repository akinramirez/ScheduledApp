package com.scheduled.cron.ScheduledApp.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronService {

    /*
     https://crontab.cronhub.io/
     https://www.freeformatter.com/cron-expression-generator-quartz.html
     https://www.baeldung.com/spring-scheduled-tasks
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
