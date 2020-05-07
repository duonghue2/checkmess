package checkform.checkmess.automata;

public class State9 extends State0{

	

		 public int getNext(char c,int State){
			 if(this.State>1) this.State=State;
		    	else
		    	this.State=0;
		        if(c != ' ')
		            return 9;
		        else
		            return 0;
		    }
	 

}
