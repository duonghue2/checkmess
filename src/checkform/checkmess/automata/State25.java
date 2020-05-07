package checkform.checkmess.automata;

public class State25 extends State0 {
	 public int getNext(char c,int State){
		 if(State>1) this.State=State;
		 else this.State=11;
	        if(c != ' ')
	            return 25;
	        else
	            return 0;
	    }


}
