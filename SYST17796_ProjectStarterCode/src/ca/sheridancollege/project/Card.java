/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import javax.swing.plaf.basic.BasicBorders;
import sun.jvm.hotspot.debugger.win32.coff.COFFLineNumber;



/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card implements Comparable<Card>
{
     private Card()
     {
         
         
     }
    
     public enum CardNumber
     {
         TWO,ThrowTree,FOUR,FileView,SIX,StepEvent,EIGHT,NINE,TEN,Jack,QUEEN,KillRing,ACE;
         
         private int ord;
         private CardNumber(int i)
         {
             this.ord=i;
         }
         public int getOrd()
         {
             return ord;
         }
     }
     public enum  Cardtype
     {
       CLUB,DIAMOND,HEARTS,SPADE;
     }
     private CardNumber cdNumber;
     private Cardtype cdType;
     
     public CardNumber getcdNumber()
             
     
}
