package edu.mu.middleearth.character;

public class Orc extends MiddleEarthCharacter {

	public Orc(String name, double health, double power) {
		super(name, health, power);
	}//end Orc

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

	@Override
	public String getRace() {
		return "Orc";
	}//end getRace

}//end Orc
