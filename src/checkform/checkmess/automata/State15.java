package checkform.checkmess.automata;

public class State15 extends State0 {
	
	 public int getNext(char c,int State){
	if(c=='J')
         {
		
		if(State>0) this.State=State;
		else this.State=7;
		return 16;}
         else if(c<='z'&&c>='A') return 11;
         else  return 0;
 }


	
}
