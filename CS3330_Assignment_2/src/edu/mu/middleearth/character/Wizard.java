package edu.mu.middleearth.character;

public class Wizard extends MiddleEarthCharacter {

	public Wizard(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}//end Wizard
	
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

	@Override
	public String getRace() {
		return "Wizard";
	}//end getRace

}//end Wizard
