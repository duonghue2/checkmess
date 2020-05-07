package checkform.checkmess.automata;

public class State18 extends State0 {

	 public int getNext(char c,int State){
	    	if (c == ' ' || c == '\0')
	    	{
	    		this.State=9;
	    		return -4;}
	        else if(c<='z'&&c>='A')
	            {
	        	if(State>7) this.State=State;
	        	else this.State=8;
	        	return 20;}
	        else return 18;
	       
	    }
	    

}
