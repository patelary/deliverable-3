/*
 * Aryan Patel
 *  Student Id:- 991511203
 * SYS10199 - WEB PROGRAMMING 
 */
package project;

import java.util.Collections;

/**
 *
 * @author aryan
 */
 public class Shuffle extends GroupOfCards{

    public Shuffle(int givenSize) {
        super(givenSize);
    }
        
        public void shuffle(){
        Collections.shuffle(cards);
    }
    }
