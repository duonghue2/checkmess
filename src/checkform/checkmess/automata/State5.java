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
public class State5 extends State0 {
    public int getNext(char c,int State){
    	
    	
    	if (c == ' ' || c == '\0')
    	{ this.State=2;
    		return -1;
    	}
        else if(c<='z'&&c>='A')
            {if(this.State>1) this.State=State;
        	else
            	this.State=1;
        	
        	
        	return 7;}
        else return 5;
       
    }
   
}
