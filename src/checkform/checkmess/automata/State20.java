package checkform.checkmess.automata;

public class State20 extends State0 {

	 public int getNext(char c,int State){
		 if(State>6) this.State=State;
		 else this.State=8;
		 
		 if(c == ' '||c=='\0')
             {
    		 
    		 
    		 return 20;}
         else 
         {
            return 9;
         }
    }
       

}
