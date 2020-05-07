package checkform.checkmess.automata;

public class State17 extends State0 {

	public int getNext(char c,int State){
    	if(c == ' ')
            {
    		if(State>7) this.State=State;
    		else this.State=8;
    		return 17;}
        else if (c == 'G')
        {if(State>7) this.State=State;
		else this.State=8;
            return 18;
        }
        else if (c == 'B')
        {
        	if(State>7) this.State=State;
    		else this.State=8;
        	return 19;}
        else if (c == 'F')
            { if(State >1) this.State=State;
            else this.State=0;
        	return 1;}
        else 
            {if(State>7) this.State=State;
            else this.State=8;
        	return 24;}
    	
        
    }
       

}
