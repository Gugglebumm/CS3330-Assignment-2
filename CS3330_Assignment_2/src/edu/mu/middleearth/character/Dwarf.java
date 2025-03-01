package edu.mu.middleearth.character;

public class Dwarf extends MiddleEarthCharacter {

	/**
	 * Constructor for Dwarf which initializes the name, 
	 * health, and power.
	 * @param name This argument is the name of the Dwarf
	 * @param health This argument is the health of the 
	 * Dwarf
	 * @param power This argument is the power of the 
	 * Dwarf
	 */
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}//end Dwarf

	/**
	 * Overridden abstract method from the abstract 
	 * MiddleEarthCharacter class to attack another 
	 * MiddleEarthCharacter
	 * @param target This argument is the target of 
	 * the Dwarf's attack
	 * @return False if the target is same race as Dwarf
	 * or if target is a Wizard.
	 * 	True if target is any other race
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (this.getRace() == target.getRace() || target.getRace() == "Wizard") {
			System.out.println("Ineffective");
			return false;
		}//end if
		else if (target.getRace() == "Elf") {
			System.out.println("1.5X Damage");
			target.setHealth(target.getHealth() - (this.getPower() * 1.5));
			return true;
		}//end else if
		else {
			System.out.println("Normal Damage");
			target.setHealth(target.getHealth() - this.getPower());
			return true;
		}//end else
	}

	/**
	 * Retrieves the race of Dwarf
	 * @return "Dwarf"
	 */
	@Override
	public String getRace() {
		return "Dwarf";
	}

}
