package ca.ubc.cs.cpsc210.model;

import ca.ubc.cs.cpsc210.model.constants.GameConstants;
import ca.ubc.cs.cpsc210.model.resourcehotspot.Farm;
import ca.ubc.cs.cpsc210.model.resourcehotspot.GoldMine;
import ca.ubc.cs.cpsc210.model.resourcehotspot.ResourceHotSpot;
import org.json.JSONObject;

import java.util.Objects;

//TODO: Json parsers
//TODO: Complete testing and documenting
public class Game {

    // CONSTANTS

    // LEVEL1 GAME SETTINGS
    private static final String LEVEL1 = GameConstants.LEVEL1;
    private static final int EASY_START_POP = GameConstants.EASY_START_POP;
    private static final int EASY_START_RESOURCES = GameConstants.EASY_START_RESOURCES;

    // LEVEL2 GAME SETTINGS
    private static final String LEVEL2 = GameConstants.LEVEL2;
    private static final int MEDIUM_START_POP = GameConstants.MEDIUM_START_POP;
    private static final int MEDIUM_START_RESOURCES = GameConstants.MEDIUM_START_RESOURCES;

    // LEVEL3 GAME SETTINGS
    public static final String LEVEL3 = GameConstants.LEVEL3;
    private static final int HARD_START_POP = GameConstants.HARD_START_POP;
    private static final int HARD_START_RESOURCES = GameConstants.HARD_START_RESOURCES;


    //fields
    public static ResourceHotSpot goldMine;
    public static ResourceHotSpot farm;
    private TownCentre playerTown;
    private TownCentre enemyTown;

    //TODO: try catch

    // REQUIRES: valid difficulty
    // MODIFIES: this
    // EFFECTS: makes game depending on difficulty
    public Game(String difficulty) {
        if (difficulty.equals(LEVEL1)) {
            setupGame(EASY_START_POP, EASY_START_RESOURCES, EASY_START_RESOURCES);
        } else if (difficulty.equals(LEVEL2)) {
            setupGame(MEDIUM_START_POP, MEDIUM_START_RESOURCES, MEDIUM_START_RESOURCES);
        } else if (difficulty.equals(LEVEL3)) {
            setupGame(HARD_START_POP, HARD_START_RESOURCES, HARD_START_RESOURCES);
        } else {
            System.out.println("Invalid");
        }
        //forests = new Forest();
    }

    public Game(JSONObject j) {
        setupGame(j);
    }

    // REQUIRES: (pop, food, gold) >= 0
    // EFFECTS: sets game with give population, food
    private void setupGame(int pop, int food, int gold) {
        playerTown = new TownCentre(pop, food, gold, true);
        enemyTown = new TownCentre(pop, food, gold, false);

        goldMine = new GoldMine();
        farm = new Farm();
    }

    public ResourceHotSpot getFarm() {
        return farm;
    }

    public ResourceHotSpot getGoldMine() {
        return goldMine;
    }

    private void setupGame(JSONObject j) {

        JSONObject goldMineJson = j.getJSONObject("goldMine");
        goldMine = new GoldMine(goldMineJson);
        JSONObject farmJson = j.getJSONObject("farm");
        farm = new Farm(farmJson);

        JSONObject playerTownJson = j.getJSONObject("playerTown");
        playerTown = new TownCentre(playerTownJson);
        JSONObject enemyTownJson = j.getJSONObject("enemyTown");
        playerTown = new TownCentre(enemyTownJson);

    }


    public TownCentre getEnemyTown() {
        return enemyTown;
    }

    public TownCentre getPlayerTown() {
        return playerTown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(playerTown, game.playerTown)
                && Objects.equals(enemyTown, game.enemyTown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerTown, enemyTown);
    }
}