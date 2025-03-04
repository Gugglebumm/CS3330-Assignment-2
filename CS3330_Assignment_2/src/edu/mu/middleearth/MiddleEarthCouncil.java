package edu.mu.middleearth;

import edu.mu.middleearth.character.CharacterManager;

public class MiddleEarthCouncil {

    private static MiddleEarthCouncil instance;
    private CharacterManager characterManager;

    // Private constructor to ensure Singleton pattern
    private MiddleEarthCouncil() {
        characterManager = new CharacterManager();
    }

    // Public method to get the Singleton instance
    public static MiddleEarthCouncil getInstance() {
        if (instance == null) {
            instance = new MiddleEarthCouncil();
        }
        return instance;
    }

    // Getter for the CharacterManager
    public CharacterManager getCharacterManager() {
        return characterManager;
    }
}