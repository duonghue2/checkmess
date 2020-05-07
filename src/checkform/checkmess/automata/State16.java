package checkform.checkmess.automata;

public class State16 extends State0 {

	 public int getNext(char c,int State){
		 if(c == ' ')
	            {
			 if(State>6) this.State=State;
			 else this.State=8;
			 return 17;}
	    	
	    	else  if(c<='z'&&c>='A') {
	    		if(this.State>6) this.State=State;
	    		else this.State=7;
	    		return 26;}
	    	else return 11;
		 }

		
}
