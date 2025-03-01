package edu.mu.middleearth.character;

public abstract class MiddleEarthCharacter {
	
	private String name;
	private double  health;
	private double power;
	
	/**
	 * Constructor for MiddleEarthCharacter which initializes
	 * the name, health, and power.
	 * @param name This argument is the name of the 
	 * MiddleEarthCharacter
	 * @param health This argument is the health of the 
	 * MiddleEarthCharacter
	 * @param power This argument is the power of the
	 * MiddleEarthCharacter
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}//end MiddleEarthCharacter
	
	/**
	 * Retrieves the name of the MiddleEarthCharacter
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end getName

	/**
	 * Sets the name of the MiddleEarthCharacter
	 * @param name this argument is the name to
	 * be assigned to the MiddleEarthCharacter
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/**
	 * Retrieves the health of the MiddleEarthCharacter
	 * @return the health
	 */
	public double getHealth() {
		return health;
	}//end getHealth

	/**
	 * Sets the health of the MiddleEarthCharacter
	 * @param name This argument is the health to
	 * be assigned to the MiddleEarthCharacter
	 */
	public void setHealth(double health) {
		this.health = health;
	}//end setHealth

	/**
	 * Retrieves the power of the MiddleEarthCharacter
	 * @return The power
	 */
	public double getPower() {
		return power;
	}//end getPower

	/**
	 * Sets the power of the MiddleEarthCharacter
	 * @param name This argument is the power to
	 * be assigned to the MiddleEarthCharacter
	 */
	public void setPower(double power) {
		this.power = power;
	}//end setPower

	/**
	 * Abstract method for a MiddleEarthCharacter
	 * to attack another MiddleEarthCharacter
	 * @param target This argument is the target of 
	 * the MiddleEarthCharacter's attack
	 * @return true or false
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	/**
	 * Abstract method for retrieving the race of
	 * the MiddleEarthCharacter
	 * @return A string of the MiddleEarthCharacter's
	 * race
	 */
	public abstract String getRace();
	
	/**
	 * Prints the character info of the MiddleEarthCharacter
	 */
	public void displayInfo() {
		System.out.println("Character Info: [Name = " + this.name + ", Health = " + this.health + ", Power = " + this.power + "]");
	}//end displayInfo

}//end MiddleEarthCharacter
