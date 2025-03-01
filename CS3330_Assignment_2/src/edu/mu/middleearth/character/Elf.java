package edu.mu.middleearth.character;

public class Elf extends MiddleEarthCharacter {

	/**
	 * Constructor for Elf which initializes the name, 
	 * health, and power.
	 * @param name This argument is the name of the Elf
	 * @param health This argument is the health of the Elf
	 * @param power This argument is the power of the Elf
	 */
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}//end Elf

	/**
	 * Overridden abstract method from the abstract 
	 * MiddleEarthCharacter class to attack another 
	 * MiddleEarthCharacter
	 * @param target This argument is the target of 
	 * the Elf's attack
	 * @return False if the target is same race as Elf
	 * or if target is a Dwarf.
	 * 	True if target is any other race
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (this.getRace() == target.getRace() || target.getRace() == "Dwarf") {
			System.out.println("Ineffective");
			return false;
		}//end if
		else if (target.getRace() == "Orc") {
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
	 * Retrieves the race of Elf
	 * @return "Elf"
	 */
	@Override
	public String getRace() {
		return "Elf";
	}//end getRace

	
	
	

}//end Elf
