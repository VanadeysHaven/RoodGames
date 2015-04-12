package me.Cooltimmetje.RoodGames.Utils;

import java.util.Random;

/**
 * This class has been created on 10-4-2015 at 19:35 by cooltimmetje.
 */
public class MiscUtils {

    public static boolean isInt(String str){
        try{
            int num = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String color(String text){
        return text.replace('&', '§');
    }

    public static int randomInt(int min, int max){
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
