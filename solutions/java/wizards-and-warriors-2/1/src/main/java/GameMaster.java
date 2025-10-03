import java.lang.StringBuilder;

public class GameMaster {

    public String describe(Character character){
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

     public String describe(Destination destination){
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod t){
        if(t.name().toLowerCase().equals("walking")) {
            return "You're traveling to your destination by " + t.name().toLowerCase() +".";
        } else {
            return "You're traveling to your destination on " + t.name().toLowerCase() +".";
        }
    }

     public String describe(Character character, Destination destination,TravelMethod t){
        return describe(character) + " " + describe(t) +  " " + describe(destination);
    }

    public String describe(Character character, Destination destination){
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
