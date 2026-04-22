import java.util.*;
import java.io.*;
class Cell{
   private boolean isHidden = false;
   private int code = 2;
   private char glyph = '\u2588';
   
   public Cell(){
      return;
   }
   
   public Cell(int c){
      code = c;
      switch(code){
         case 1: glyph = '\u2007';
            break;
         case 2: glyph = '\u2588';
            break;
         case 3: glyph = '\u2620';
            break;
         case 4: glyph = '\u2654';
            break;
	 case 5: glyph = 'x';
	    break;
      }      
   }
   
   public boolean getIsHidden(){
      return isHidden;
   }
   
   public int getCode(){
      return code;
   }
   
   public char getGlyph(){
      return glyph;
   }
   
   public void setIsHidden(boolean a){
      isHidden = a;
   }
   
   public void setGlyph(int a){
      if(a > 0 && a <= 5){
         code = a;  
    	  switch(code){
    	     case 1: glyph = '\u2007';
    	        break;
    	     case 2: glyph = '\u2588';
    	        break;
    	     case 3: glyph = '\u2620';
    	        break;
    	     case 4: glyph = '\u2654';
    	        break;
	     case 5: glyph = 'x';
	        break;
	      }      
      }
      else{
         return;
      }
   }
   
   public void toggleIsHidden(){
      if(isHidden){
         isHidden = false;
      }
      else{
         isHidden = true;
      }
   }
   
   public String toString(){
      return "" + glyph;
   }
}
