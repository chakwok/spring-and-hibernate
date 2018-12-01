package practice7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SelfCoachConfig {
	@Bean
	public FortuneService selfFortuneService() {
		return new SelfFoutunateService();
	}
	
	@Bean 
	public Coach selfCoach(FortuneService fs) {
		return new SelfCoach(selfFortuneService());
	}
}


