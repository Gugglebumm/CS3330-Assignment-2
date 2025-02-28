package edu.mu.middleearth.character;

public class Human extends MiddleEarthCharacter {

	public Human(String name, double health, double power) {
		super(name, health, power);
	}//end Human

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

	@Override
	public String getRace() {
		return "Human";
	}//end getRace

}//end Human
