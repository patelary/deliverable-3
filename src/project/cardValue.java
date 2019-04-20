
package project;

import java.util.Random;

import project.cardColor.Color;

public class cardValue extends Card{
   public enum Value{ 
	   ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,DRAW_2,DRAW_4,WILDCARD,REVERSE;
	   
	   public static Value valueReturn() {
		   
	    	Value[] val = Value.values();
	    	Random generator = new Random();
	    	
			return val[generator.nextInt(val.length)];
	    	
	    }
	   
   }
	private final Value value;
	public cardValue(Value v) {
		value = v;
	}
	
	public Value getcardValue()
	{
		
	    return this.value;
	}

	
}
