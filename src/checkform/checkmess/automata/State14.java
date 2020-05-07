package checkform.checkmess.automata;

public class State14 extends State0 {

	  public int getNext(char c,int State){
	    	 if(c == ' '||c=='\0')
	             {
	    		  this.State=5;
	    		 
	    		 return -3;}
	         else 
	            {
	        	 if(State>0) this.State=4;
	        	 return 0;
	            }
	        
	    }
	   
}
