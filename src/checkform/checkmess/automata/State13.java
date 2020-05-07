package checkform.checkmess.automata;

public class State13 extends State0 {

	public int getNext(char c,int State){
    	if(State>4) this.State=State;
    	else this.State=4;
		
		if(c=='l') return 14;
    	 else  return 8;
    	
        
    }
   
}
