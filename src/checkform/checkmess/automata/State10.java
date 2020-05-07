package checkform.checkmess.automata;

public class State10 extends State0 {

	 public int getNext(char c){
		 
	        if(c != ' ')
	            return 10;
	        else
	            return 0;
	    }

}
