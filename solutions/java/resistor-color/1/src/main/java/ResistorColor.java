import java.util.*;
    
class ResistorColor {
    int colorCode(String color) {
        Map <String, Integer> clrCode = new HashMap<>();
        String[] clrs = colors();

        for(int i = 0; i<clrs.length;i++){
            clrCode.put(clrs[i], i);
        }

        return clrCode.get(color);
    }

    String[] colors() {
        String[] clrs = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return clrs;  
    }
}
