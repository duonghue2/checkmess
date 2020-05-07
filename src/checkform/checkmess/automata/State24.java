package checkform.checkmess.automata;

public class State24 extends State0 {

	 public int getNext(char c,int State){
	        if(c != ' ')
	        {if(State>7) this.State=State;
	        else this.State=8;
	            return 24;}
	        else {
	        	if(State>0) this.State=State;
		        else this.State=0;
	        	return 0;
	        }
	    }


}
