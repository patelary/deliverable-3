
package project;

import java.util.Random;

public class cardColor extends Card{

    public enum Color {
        RED, GREEN, BLUE, YELLOW;
    	public static Color colorReturn() {
        	
        	Color[] col = Color.values();
        	
        	Random generator = new Random();
    		return col[generator.nextInt(col.length)];
        	
        }
    	
    }
    private final Color color;

    public cardColor(Color c) {
        color = c;
    }

    public Color getColor() {
        return this.color;
    }
    
}
	


        




    
    
