package edu.mu.middleearth.character;

public class CharacterManager {
	
	private MiddleEarthCharacter[] characters;
    private int size;
    /*
     * constructor for initializing character array
     */
    public CharacterManager() {
        characters = new MiddleEarthCharacter[5]; // Initial capacity
        size = 0;
    }

    /*
     * Adds a character to the array 
     * If full then it doubles the array size.
     * @param c the character to be added
     */
    public void addCharacter(MiddleEarthCharacter c) {
        if (size == characters.length) {
            resizeArray();
        }
        characters[size] = c;
        size++;
    }

    /*
     * Retrieves a character by name.
     * @param name is the name of character to get
     * @return if found Null if not
     */
    public MiddleEarthCharacter getCharacter(String name) {
        for (int i = 0; i < size; i++) {
            if (characters[i].getName().equalsIgnoreCase(name.trim())) { // Trim name to match properly
                return characters[i];
            }
        }
        return null; // Character not found
    }

    /*
     * Updates a character's health and power by name.
     * @param name the name of character to be updated
     * @param health the new health for the character
     * @param power the new power for the character
     */
    public void updateCharacter(String name, double health, double power) {
        for (int i = 0; i < size; i++) {
            if (characters[i].getName().equalsIgnoreCase(name.trim())) { // Trim name to match properly
                characters[i].setHealth(health);
                characters[i].setPower(power);
                System.out.println("Character updated successfully.");
                return;
            }
        }
        System.out.println("Character not found.");
    }

    /*
     * Deletes a character by name.
     * @param name the name of character to delete
     */
    public void deleteCharacter(String name) {
        for (int i = 0; i < size; i++) {
            if (characters[i].getName().equalsIgnoreCase(name.trim())) { // Trim name to match properly
                // Shift elements to delete the character
                for (int j = i; j < size - 1; j++) {
                    characters[j] = characters[j + 1];
                }
                characters[size - 1] = null; // Remove reference to the last element
                size--; // Decrease size
                System.out.println("Character deleted successfully.");
                return;
            }
        }
        System.out.println("Character not found.");
    }

    /*
     * Displays all characters in the system.
     * Calls displayInfo() for characters
     */
    public void displayAllCharacters() {
        if (size == 0) {
            System.out.println("No characters to display.");
            return;
        }
        for (int i = 0; i < size; i++) {
            characters[i].displayInfo(); // Calls the displayInfo() method on each character
        }
    }

    /*
     * Resizes the array when it reaches its capacity.
     * Then double size of array
     */
    private void resizeArray() {
        MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
        System.arraycopy(characters, 0, newArray, 0, characters.length);
        characters = newArray;
    }

}//end CharacterManager
