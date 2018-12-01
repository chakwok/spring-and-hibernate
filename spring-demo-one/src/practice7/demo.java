package practice7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SelfCoachConfig.class);
		
		Coach coach = context.getBean("selfCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
