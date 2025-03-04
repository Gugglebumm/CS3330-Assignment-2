package edu.mu.middleearth.character;

public class Wizard extends MiddleEarthCharacter {

	/**
	 * Constructor for Wizard which initializes the name, 
	 * health, and power.
	 * @param name This argument is the name of the 
	 * Wizard
	 * @param health This argument is the health of the 
	 * Wizard
	 * @param power This argument is the power of the 
	 * Wizard
	 */
	public Wizard(String name, double health, double power) {
		super(name, health, power);
	}//end Wizard
	
	/**
	 * Overridden abstract method from the abstract 
	 * MiddleEarthCharacter class to attack another 
	 * MiddleEarthCharacter
	 * @param target This argument is the target of 
	 * the Wizard's attack
	 * @return False if the target is same race as Wizard
	 * or if target is a Human.
	 * 	True if target is any other race
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (this.getRace() == target.getRace() || target.getRace() == "Human") {
			System.out.println("Ineffective");
			return false;
		}//end if
		else if (target.getRace() == "Dwarf") {
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
	 * Retrieves the race of Wizard
	 * @return "Wizard"
	 */
	@Override
	public String getRace() {
		return "Wizard";
	}//end getRace

}//end Wizard
