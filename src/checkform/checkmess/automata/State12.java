package checkform.checkmess.automata;

public class State12 extends State0 {

	  public int getNext(char c,int State){
		  if(State>4) this.State=State;
	        else this.State=4;
		  
		  if(c=='e')
	        {
	        	if(State>4) this.State=State;
	        	else this.State=4;
	        	return 13;
	        }
		  else if(c<='z'&&c>='A') return 8;
	        else return 0;
	              
	        
	  
}

	    
	 
}
