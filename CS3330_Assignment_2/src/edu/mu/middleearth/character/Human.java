package edu.mu.middleearth.character;

public class Human extends MiddleEarthCharacter {

	/**
	 * Constructor for Human which initializes the name, 
	 * health, and power.
	 * @param name This argument is the name of the Human
	 * @param health This argument is the health of the 
	 * Human
	 * @param power This argument is the power of the 
	 * Human
	 */
	public Human(String name, double health, double power) {
		super(name, health, power);
	}//end Human

	/**
	 * Overridden abstract method from the abstract 
	 * MiddleEarthCharacter class to attack another 
	 * MiddleEarthCharacter
	 * @param target This argument is the target of 
	 * the Human's attack
	 * @return False if the target is same race as Human
	 * or if target is an Orc.
	 * 	True if target is any other race
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (this.getRace() == target.getRace() || target.getRace() == "Orc") {
			System.out.println("Ineffective");
			return false;
		}//end if
		else if (target.getRace() == "Wizard") {
			System.out.println("1.5X Damage");
			target.setHealth(target.getHealth() - (this.getPower() * 1.5));
			return true;
		}//end else if
		else {
			System.out.println("Normal Damage");
			target.setHealth(target.getHealth() - this.getPower());
			return true;
		}//end else
	}//end attack

	/**
	 * Retrieves the race of Human
	 * @return "Human"
	 */
	@Override
	public String getRace() {
		return "Human";
	}//end getRace

}//end Human
