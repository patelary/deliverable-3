
package project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size = 60;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
     public void setSize(int givenSize) {
        size = givenSize;
    }
    
   
    public class ShowCards{
        
    }
    public class Shuffle{
        
        public void shuffle(){
        Collections.shuffle(cards);
    }
    }
    
    public int getSize() {
        return size;
    }
    
}//end class