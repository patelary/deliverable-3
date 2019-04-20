/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import project.Player;

/**
 *
 * @author Aryan Chaudhari
 */
public class UnitTestForUno {
    
    public UnitTestForUno() {
    }
    
    
 @Test
    public void checkgoodName(){
        System.out.print( "There is no special char in name");
         System.out.print( "Good Test Case");
        
        String name="john";
       
        boolean result=Player.NameIdentifier(name);
        assertEquals(true,result);
        
    }
    
     @Test
    public void checkbedName(){
         System.out.print( "There is special char in name");
         System.out.print( "Bed Test Case");
        String name="#can!12";
        boolean result=Player.NameIdentifier(name);
        assertEquals(false,result);
        
    }
    
     @Test
    public void checkBoundaryName(){
         System.out.print( "There is no special char in name");
         System.out.print( "Boundary Test Case");
        String name="aryubbdiad";
        boolean result=Player.NameIdentifier(name); 
        assertEquals(true,result);
        
    }
 
}
