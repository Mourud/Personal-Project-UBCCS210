package ca.ubc.cs.cpsc210.model.constants;


import ca.ubc.cs.cpsc210.model.Position;

public class GameConstants {

    // CONSTANTS

        // GAME TITLE
    public static final String TITLE = "The Myth";
    public static final String CUSTOM = "C";

    // DISPLAY
    public static final int GAME_SCREEN_WIDTH = 1000;
    public static final int GAME_SCREEN_HEIGHT = 1000;

        // DIFFICULTY CONSTANTS

            // LEVEL1 SETTINGS
    public static final String LEVEL1 = "Easy";
    public static final int EASY_START_POP = 15;
    public static final int EASY_START_RESOURCES = 500;

            // LEVEL2 SETTING
    public static final String LEVEL2 = "Medium";
    public static final int MEDIUM_START_POP = 10;
    public static final int MEDIUM_START_RESOURCES = 250;

            // LEVEL3 SETTINGS
    public static final String LEVEL3 = "Hard";
    public static final int HARD_START_POP = 5;
    public static final int HARD_START_RESOURCES = 125;

        // PERSON CONSTANTS
    public static final int BIRTH_RADIUS = 50;
            // VILLAGER
    public static final int STARTING_MAX_HEALTH_VILLAGER = 50;
    public static final int STARTING_ATTACK_VILLAGER = 1;
    public static final int STARTING_GATHER_RATHER_VILLAGER = 1;
    public static final int STARTING_VILLAGER_FOOD_PRICE = 100;
    public static final int STARTING_VILLAGER_GOLD_PRICE = 0;

            // SOLDIER
    public static final int STARTING_MAX_HEALTH_SOLDIER = 100;
    public static final int STARTING_ATTACK_SOLDIER = 5;
    public static final int STARTING_GATHER_RATHER_SOLDIER = 0;
    public static final int STARTING_SOLDIER_FOOD_PRICE = 10;
    public static final int STARTING_SOLDIER_GOLD_PRICE = 10;

        // TOWN CENTRE

            // PLAYER
    public static final int PLAYER_TOWN_POS_X = 0;
    public static final int PLAYER_TOWN_POS_Y = 0;
    public static final Position PLAYER_TOWN_POS = new Position(PLAYER_TOWN_POS_X, PLAYER_TOWN_POS_Y);

            // ENEMY
    public static final int ENEMY_TOWN_POS_X = GAME_SCREEN_WIDTH;
    public static final int ENEMY_TOWN_POS_Y = GAME_SCREEN_HEIGHT;
    public static final Position ENEMY_TOWN_POS = new Position(ENEMY_TOWN_POS_X, ENEMY_TOWN_POS_Y);

    // ResourceHotSpot
    public static final int STARTING_RESOURCES = 50000;

//    public static final ResourceHotSpot GOLD_MINE = new GoldMine();
//    public static final ResourceHotSpot FARM = new Farm();
//    public static final ResourceHotSpot FOREST = new Forest();

}
