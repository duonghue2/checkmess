package checkform.checkmess.automata;

public class State23 extends State0 {
	 public int getNext(char c,int State){
    	 if(c == ' '||c=='\0')
             {this.State=12;
    		 return -6;}
         else { this.State=State;
            return 0;
         }
    }
   
	

}
