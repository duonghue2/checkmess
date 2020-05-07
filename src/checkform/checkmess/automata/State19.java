package checkform.checkmess.automata;

public class State19 extends State0 {
	 public int getNext(char c,int State){
	    	if (c == ' ' || c == '\0')
	    	{this.State=10;
	    	return -5;}
	        else if(c<='z'&&c>='A')
	            return 20;
	        else return 19;
	       
	    }
	   

}
