package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	public String emailAddress;
	public String team;
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg Constructor");
	}




	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("setting fs");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
