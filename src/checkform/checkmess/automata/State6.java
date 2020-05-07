/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkform.checkmess.automata;

/**
 *
 * @author tuanc
 */
public class State6 extends State0 {
    public int getNext(char c,int State){
   
    	
    	 if(c == ' ' || c == '\0'){
    		 this.State=3;
    		 
    		 return -2;
         }
    	 
    	 else if(c<='z'&&c>='A')
             
    		 {
    		 if(State>this.State) this.State=State; 
    		 return 7;}
    	 else 
    	 {    		 if(State>this.State) this.State=State; 

    		 return 6;}
    }
      
}
