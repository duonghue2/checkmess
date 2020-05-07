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
public class State0 {
	int State;
    public int getNext(char c, int State){
    	if(State>0) this.State=State;
    	else this.State=0;
        switch (c) {
            case 'F':
                
                	
                	return 1;
            case ' ':
                
            	return 0;
            
            default:
                return 8;
        }
    }
    
}
