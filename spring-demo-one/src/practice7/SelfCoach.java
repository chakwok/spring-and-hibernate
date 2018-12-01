package practice7;

public class SelfCoach implements Coach {
	private FortuneService fortuneService;
	
	public SelfCoach(FortuneService fs) {
		fortuneService = fs; 
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
