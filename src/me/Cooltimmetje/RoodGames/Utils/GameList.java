package me.Cooltimmetje.RoodGames.Utils;

import java.util.HashMap;

/**
 * This class has been created on 10-4-2015 at 19:21 by cooltimmetje.
 */
public class GameList {

    public static int gameAmount = 5;

    public static HashMap<String, Integer> gameID = new HashMap<String, Integer>();
    public static HashMap<Integer, String> idGame = new HashMap<Integer, String>();

    public static void listGames(){
        gameID.put("TNT Run", 1);
        gameID.put("TNT Tag", 2);
        gameID.put("Survival Games", 3);
        gameID.put("PVP - Team VS Team", 4);
        gameID.put("PVP - Solo", 5);

        idGame.put(1, "TNT Run");
        idGame.put(2, "TNT Tag");
        idGame.put(3, "Survival Games");
        idGame.put(4, "PVP - Team VS Team");
        idGame.put(5, "PVP - Solo");
    }

}
