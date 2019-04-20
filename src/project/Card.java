
package project;

import project.cardColor.Color;
import project.cardValue.Value;

public class Card {

    public void print(){
    System.out.println("Your CardRank is :"+Value.valueReturn()+" Your CardColor is :" +Color.colorReturn());
   
    }

}//class
