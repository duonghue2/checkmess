package checkform.checkmess.automata;

public class State22 extends State0 {
	 public int getNext(char c,int State){
		 if(State>1) this.State=State;
         else this.State=11;
	if(c=='g') return 23;
	 else if(c<='z'&&c>='A') {
		
		 return 25;}
	else return 0;
   
}


}
