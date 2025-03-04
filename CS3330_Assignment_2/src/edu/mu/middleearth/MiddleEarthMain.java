package edu.mu.middleearth;

import edu.mu.middleearth.character.Dwarf;
import edu.mu.middleearth.character.Elf;
import edu.mu.middleearth.character.Human;
import edu.mu.middleearth.character.Orc;
import edu.mu.middleearth.character.Wizard;

public class MiddleEarthMain {

	public static void main(String[] args) {
		
		/*
		Elf elf = new Elf("Stewart", 50.0, 10.0);
		Dwarf dwarf = new Dwarf("Timothy", 80.0, 15.0);
		Human human = new Human("Rodrick", 60.0, 12.0);
		Orc orc = new Orc("Bartholomew", 100.0, 20.0);
		Wizard wizard = new Wizard("Witherspoon", 40.0, 18.0);
		
		elf.displayInfo();
		dwarf.displayInfo();
		human.displayInfo();
		orc.displayInfo();
		wizard.displayInfo();
		
		System.out.println();
		
		System.out.println("Orc Health: " + orc.getHealth());
		if(elf.attack(orc)) {
			System.out.println("Elf Attack Hit");
		}//end if
		System.out.println("Orc Health: " + orc.getHealth());

		System.out.println();
		
		System.out.println("Human Health: " + human.getHealth());
		if(wizard.attack(human)) {
			System.out.println("Wizard Attack Hit");
		}//end if
		System.out.println("Human Health: " + human.getHealth());
		
		System.out.println();
		
		System.out.println("Dwarf Health: " + dwarf.getHealth());
		if(orc.attack(dwarf)) {
			System.out.println("Orc Attack Hit");
		}//end if
		System.out.println("Dwarf Health: " + dwarf.getHealth());
		*/ //Parker's Testing Code
		
		Menu menu = new Menu();
        menu.showMenu();

	}//end main

}
