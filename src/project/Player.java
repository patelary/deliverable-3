
package project;

import java.util.Random;
import java.util.Scanner;

public class Player {
    public int PlayerID;
   
    Scanner input = new Scanner(System.in);
    public String  name;
      
      

    public void Name() { 
        
      System.out.println("Your name should not cotntain any shpecial.");
     System.out.println("Enter the name of the player");
     
     name = input.nextLine();
    
   }
    
    public static boolean NameIdentifier(String name){ 
 
        for(int i = 0 ; i<name.length();i++)
        {
            if(!Character.isLetterOrDigit(name.charAt(i)))
            {
                return false;
            }
            return true;
        }
        return true;
    }
   
   
    public void ID() {
    	 Random id = new Random();
    	    PlayerID = id.nextInt(1000);
    	    System.out.println("Name : " + name + "  PlayerId : " + PlayerID);
    }
}
