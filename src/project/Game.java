
package project;

import java.util.ArrayList;

import project.cardColor.Color;

public abstract class Game
{
    private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    public static void main(String[] args)
    {
        Player p = new Player();
        for(int j=1; j<=2 ; j++) {
        p.Name();
        p.ID();
        Card c = new Card();
        for(int i =1 ; i <=4 ; i++) {
        	System.out.println("Card No :" + i);
        	c.print();
        	System.out.println();
        }
        }
        
    }
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }
    
    public String getGameName() 
    {
        return gameName;
    }
    
     
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }
   
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
   
    public void play(){
        
         
    };
    
    public void endGame(){
            
            
        }
    
    
}//end class
