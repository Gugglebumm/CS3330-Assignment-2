package edu.mu.middleearth.character;

public class Orc extends MiddleEarthCharacter {

	/**
	 * Constructor for Orc which initializes the name, 
	 * health, and power.
	 * @param name This argument is the name of the Orc
	 * @param health This argument is the health of the Orc
	 * @param power This argument is the power of the Orc
	 */
	public Orc(String name, double health, double power) {
		super(name, health, power);
	}//end Orc

	/**
	 * Overridden abstract method from the abstract 
	 * MiddleEarthCharacter class to attack another 
	 * MiddleEarthCharacter
	 * @param target This argument is the target of 
	 * the Orc's attack
	 * @return False if the target is same race as Orc
	 * or if target is an Elf.
	 * 	True if target is any other race
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (this.getRace() == target.getRace() || target.getRace() == "Elf") {
			System.out.println("Ineffective");
			return false;
		}//end if
		else if (target.getRace() == "Human") {
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
	 * Retrieves the race of Orc
	 * @return "Orc"
	 */
	@Override
	public String getRace() {
		return "Orc";
	}//end getRace

}//end Orc
