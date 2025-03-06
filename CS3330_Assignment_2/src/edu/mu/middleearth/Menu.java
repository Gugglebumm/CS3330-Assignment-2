package edu.mu.middleearth;

import edu.mu.middleearth.character.CharacterManager;
import edu.mu.middleearth.character.MiddleEarthCharacter;
import edu.mu.middleearth.character.Dwarf;
import edu.mu.middleearth.character.Elf;
import edu.mu.middleearth.character.Human;
import edu.mu.middleearth.character.Orc;
import edu.mu.middleearth.character.Wizard;

import java.util.Scanner;
/*
 * Used to give the menu for managing characters so that
 * they can be added, updated, deleted, displayed and to simulate a fight
 */
public class Menu {

    private CharacterManager characterManager;
    /*
     * Constructor to initialize CharacterManager
     */
    public Menu() {
        characterManager = new CharacterManager();
    }
    /*
     * Display menu
     * Take care of user inputs 
     * check for invalid inputs
     */
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;  // Initial invalid choice to enter the loop

        do {
            System.out.println("\n--- Middle Earth Character Manager ---");
            System.out.println("1. Add Character");
            System.out.println("2. Update Character");
            System.out.println("3. Delete Character");
            System.out.println("4. Display All Characters");
            System.out.println("5. Fight");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Validate the input for a valid integer choice
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCharacter(scanner);
                    break;
                case 2:
                    updateCharacter(scanner);
                    break;
                case 3:
                    deleteCharacter(scanner);
                    break;
                case 4:
                    displayAllCharacters();
                    break;
                case 5:
                    fight(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }


    /*
     * Add a character that contains health, power and character type
     * Includes parameter checks for invalid inputs
     * @param scanner Scanner object for user inputs
     */
    private void addCharacter(Scanner scanner) {
        System.out.print("Enter character name: ");
        scanner.nextLine();  // Consume the leftover newline character after nextInt() or nextDouble()
        String name = scanner.nextLine().trim();  // Trim spaces to avoid matching issues
        
        // Validate health input (must be a valid double)
        double health = 0;
        while (true) {
            System.out.print("Enter character health: ");
            if (scanner.hasNextDouble()) {
                health = scanner.nextDouble();
                break; // Valid input, break the loop
            } else {
                System.out.println("Invalid input. Please enter a valid number for health.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        // Validate power input (must be a valid double)
        double power = 0;
        while (true) {
            System.out.print("Enter character power: ");
            if (scanner.hasNextDouble()) {
                power = scanner.nextDouble();
                break; // Valid input, break the loop
            } else {
                System.out.println("Invalid input. Please enter a valid number for power.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Choose character type:");
        System.out.println("1. Elf");
        System.out.println("2. Dwarf");
        System.out.println("3. Human");
        System.out.println("4. Orc");
        System.out.println("5. Wizard");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                characterManager.addCharacter(new Elf(name, health, power));
                break;
            case 2:
                characterManager.addCharacter(new Dwarf(name, health, power));
                break;
            case 3:
                characterManager.addCharacter(new Human(name, health, power));
                break;
            case 4:
                characterManager.addCharacter(new Orc(name, health, power));
                break;
            case 5:
                characterManager.addCharacter(new Wizard(name, health, power));
                break;
            default:
                System.out.println("Invalid character type.");
                return;
        }
        System.out.println("Character added successfully!");
    }

    /*
     * Update characters health,power or both via user input
     * @param scanner Scanner object for user input
     */
    private void updateCharacter(Scanner scanner) {
        System.out.println("Enter character name to update: ");
        scanner.nextLine(); // Consume the newline character left by nextInt() in showMenu()
        String name = scanner.nextLine().trim(); // Trim spaces to avoid matching issues

        MiddleEarthCharacter character = characterManager.getCharacter(name);
        if (character != null) {
            System.out.println("Enter new health: ");
            double newHealth = 0;
            boolean validHealth = false;
            while (!validHealth) {
                try {
                    newHealth = scanner.nextDouble();
                    validHealth = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number for health.");
                    scanner.nextLine(); // Clear the buffer
                }
            }

            System.out.println("Enter new power: ");
            double newPower = 0;
            boolean validPower = false;
            while (!validPower) {
                try {
                    newPower = scanner.nextDouble();
                    validPower = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number for power.");
                    scanner.nextLine(); // Clear the buffer
                }
            }

            // Call the update method, without expecting a boolean return value
            characterManager.updateCharacter(character.getName(), newHealth, newPower);
            System.out.println("Character updated successfully.");
        } else {
            System.out.println("Character not found.");
        }
    }


    /*
     * Delete a selected character from the system via user input
     * @param scanner Scanner object for user inputs
     */
    private void deleteCharacter(Scanner scanner) {
        System.out.print("Enter character name to delete: ");
        scanner.nextLine();  // Consume any leftover newline from previous input
        String name = scanner.nextLine().trim();  // Trim spaces to avoid matching issues

        // Call the delete function in CharacterManager
        characterManager.deleteCharacter(name);  // This will directly call the deleteCharacter method with exact matching
    }

    /*
     * Display all characters in the system
     */
    private void displayAllCharacters() {
        characterManager.displayAllCharacters(); // Call the display function from CharacterManager
    }

    /*
     * Simulate a fight between two characters and are chosen via user input
     * @param scanner Scanner object for user input
     */
    private void fight(Scanner scanner) {
        System.out.println("Choose two characters to fight!");
        System.out.print("Enter the name of the first character: ");
        scanner.nextLine(); // Consume leftover newline
        String firstCharacterName = scanner.nextLine().trim();
        
        System.out.print("Enter the name of the second character: ");
        String secondCharacterName = scanner.nextLine().trim();

        MiddleEarthCharacter firstCharacter = characterManager.getCharacter(firstCharacterName);
        MiddleEarthCharacter secondCharacter = characterManager.getCharacter(secondCharacterName);

        if (firstCharacter == null || secondCharacter == null) {
            System.out.println("One or both characters not found.");
            return;
        }

        System.out.println("Battle Starting...");
        while (firstCharacter.getHealth() > 0 && secondCharacter.getHealth() > 0) {
            // Simulate the attack
            System.out.println(firstCharacter.getName() + " attacks " + secondCharacter.getName());
            secondCharacter.setHealth(secondCharacter.getHealth() - firstCharacter.getPower());
            System.out.println(secondCharacter.getName() + " Health: " + secondCharacter.getHealth());

            if (secondCharacter.getHealth() <= 0) {
                System.out.println(secondCharacter.getName() + " has been defeated!");
                System.out.println(firstCharacter.getName() + " wins the fight!");
                return;
            }

            System.out.println(secondCharacter.getName() + " attacks " + firstCharacter.getName());
            firstCharacter.setHealth(firstCharacter.getHealth() - secondCharacter.getPower());
            System.out.println(firstCharacter.getName() + " Health: " + firstCharacter.getHealth());

            if (firstCharacter.getHealth() <= 0) {
                System.out.println(firstCharacter.getName() + " has been defeated!");
                System.out.println(secondCharacter.getName() + " wins the fight!");
                return;
            }
        }
    }
}
