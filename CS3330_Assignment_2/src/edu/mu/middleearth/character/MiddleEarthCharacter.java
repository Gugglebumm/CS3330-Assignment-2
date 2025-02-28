package edu.mu.middleearth.character;

public abstract class MiddleEarthCharacter {
	
	private String name;
	private double  health;
	private double power;
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}//end MiddleEarthCharacter
	
	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	public double getHealth() {
		return health;
	}//end getHealth

	public void setHealth(double health) {
		this.health = health;
	}//end setHealth

	public double getPower() {
		return power;
	}//end getPower

	public void setPower(double power) {
		this.power = power;
	}//end setPower

	public abstract boolean attack(MiddleEarthCharacter target);
	
	public abstract String getRace();
	
	public void displayInfo() {
		System.out.println("Character Info: [Name = " + this.name + ", Health = " + this.health + ", Power = " + this.power + "]");
	}//end displayInfo

}//end MiddleEarthCharacter
