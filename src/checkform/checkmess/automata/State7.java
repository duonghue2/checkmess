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
public class State7 extends State0 {
    public int getNext(char c,int State){
    	if(this.State>1) this.State=State;
    	else
    	this.State=1;
    		if(c==' '||c=='\0') return 7;
    		
    	return 9;
    	
    }
     
}
