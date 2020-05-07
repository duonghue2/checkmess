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
public class State4 extends State0 {
	
    public int getNext(char c,int State){
    	
    	if(State<1)
        	this.State=1;
        	else this.State=State;
    	if(c == ' ')
            return 4;
        else if (c == 'G')
            {
        	
        	return 5;}
        else if (c == 'B')
            
        { 
        	return 6;
        }
        	else if (c == 'F')
        	{
        		if(this.State<1) this.State=0;
        		return 1;
        	}
        else if(c=='d') {
        	if(State>0) this.State=State;
        	else this.State=4;
        	
        	return 12;}
        else if(c=='c') {
        	if(State>0) this.State=State;
        	else this.State=11;
        	
        	return 21;}
        else if(c=='R') {
        	if(State>0) this.State=State;
        	else this.State=7;
        	
        	return 15;}
        else if(c<='z'&&c>='A')
        {
        	if(State>0) this.State=State;
        else this.State=1;
        
        	return 8;}
        else {
        	if(State>0) this.State=State;
            else this.State=1;
        	
        	return 9;
        }
        
    }
   
}
