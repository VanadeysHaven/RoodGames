package me.Cooltimmetje.RoodGames.Utils;

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
}
