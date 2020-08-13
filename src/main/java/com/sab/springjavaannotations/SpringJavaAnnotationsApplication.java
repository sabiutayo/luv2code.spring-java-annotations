package com.sab.springjavaannotations;

import com.sab.springjavaannotations.config.Config;
import com.sab.springjavaannotations.interfaces.Coach;
import com.sab.springjavaannotations.model.TennisCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringJavaAnnotationsApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Coach coach = (TennisCoach) context.getBean("tennisCoach");
        Coach theCoach = context.getBean("swimCoach",Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        String tennisCoachEmail = context.getBean("tennisCoach",TennisCoach.class).getEmail();
        System.out.println(tennisCoachEmail);
        context.close();
    }

}
