package checkform.checkmess.automata;

public class State26 extends State0 {

	public int getNext(char c,int State){
   	 
		if(State>1) this.State=State;
		else this.State=7;
		if(c == ' ')
            return 0;
        else
            return 26;
       
   }
       
}
