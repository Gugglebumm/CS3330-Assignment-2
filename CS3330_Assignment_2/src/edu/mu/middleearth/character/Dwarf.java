package edu.mu.middleearth.character;

public class Dwarf extends MiddleEarthCharacter {

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}//end Dwarf

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

	@Override
	public String getRace() {
		return "Dwarf";
	}

}
