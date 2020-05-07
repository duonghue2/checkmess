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
public class State1 extends State0 {
	
    public int getNext(char c,int State){
    	
        if(c=='r')
                {
        	if(State>0) this.State=State;
        	else this.State=0;
        	return 2;
            
                
                }
                else if(c<='z'&&c>='A') return 8;
                else
                return 0;
        }
    
    
}
