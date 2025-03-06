package edu.mu.middleearth;

import edu.mu.middleearth.character.CharacterManager;
/*
 * Used to implement singleton pattern to make sure
 * only one instance of council is present
 */
public class MiddleEarthCouncil {

    private static MiddleEarthCouncil instance;
    private CharacterManager characterManager;

    /*
     * Private constructor to ensure Singleton pattern
     */
    private MiddleEarthCouncil() {
        characterManager = new CharacterManager();
    }

    /*
     * Public method to get the Singleton instance
     * if instance doesn't exist then its created
     * @return instance of MiddleEarthCouncil
     */
    public static MiddleEarthCouncil getInstance() {
        if (instance == null) {
            instance = new MiddleEarthCouncil();
        }
        return instance;
    }

    /*
     * Getter for the CharacterManager
     * @return CharacterManager instance
     */
    public CharacterManager getCharacterManager() {
        return characterManager;
    }
}