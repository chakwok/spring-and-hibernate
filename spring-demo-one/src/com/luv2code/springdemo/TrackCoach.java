package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}
	
	@Override 
	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}

	// init method
	public void doMyStartupStuff() {
		System.out.println("startup");
	}
	//destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("cleanup");
	}
}
