package checkform.checkmess;

import java.util.ArrayList;

import checkform.checkmess.automata.Automata;
import checkform.phonenumber.CheckPhone;

public class test {
	
//ArrayList <message> listMes=new ArrayList<message>();
int countWrongMess=0;	

public test() {
		// TODO Auto-generated constructor stub
	}
/*public void countWrongMessage() {
	for(message i:listMes) {
		if(i.result==0) this.countWrongMess++;
	}
	
	
}*/
public void main(String[ ]args) {
	
	
	test y=new test();
	message mes = new message("Frd G", 8088, "0904566971");
	Automata x = new Automata();
	CheckPhone phone = new CheckPhone(mes.PhoneNumber);
	if (!phone.isValidE123())
		System.exit(0);
		
	if (mes.checkValidMessage(mes.message)) {

		 mes.checkReceiver(x.result(mes.message),2, "girl");

		// System.out.print(x.result(mes.message));
		
		mes.printMessage();

	} else
		{System.out.println("wrong format");
		
		
		}
}
	


}
