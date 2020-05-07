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
public class State2 extends State0 {
    public int getNext(char c,int State){
    	if(State>0) this.State=State;
    	else this.State=0;
    	if(c=='d') return 3;
    	else if(c>='A'&&c<='z') return 9;
    	else return 8;
        
    }
   
}
