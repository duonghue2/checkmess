package checkform.checkmess;

import checkform.checkmess.automata.Automata;
import checkform.phonenumber.CheckPhone;

public class message {
	String message;
	int receiver;
	String messageReturn = null;// message send back to receiver
	String PhoneNumber;
	int result;

	boolean isTrueReceiver = false;

	public message() {
		// TODO Auto-generated constructor stub

	}

	public message(String message, int receiver, String phone) {
		this.message = message + ' ';
		this.receiver = receiver;
		this.PhoneNumber = phone;
		if (this.receiver == 8011 || this.receiver == 8033 || this.receiver == 8088)
			this.isTrueReceiver = true;

	}

	public void printMessage() {
		if (this.messageReturn != null)
			System.out.println(this.messageReturn);
	}

	public boolean checkValidMessage(String message) {
		if (message == null)
			return false;
		if (message == "")
			return false;
		else
			return true;
	}

	public void checkReceiver(int state, int index, String gender) {
		/*
		 * return 2: send girl's number return 3: send boy's number return 5: accept del
		 * return 9: rejoin girl return 10 : rejoin boy return 12: accept chag
		 * 
		 * 
		 */

		if (index == -1) {
			if (this.receiver != 8088) {
				this.messageReturn = "You should send \"Frd B\" or \"Frd G\"to 8088 ";
				this.result= 0;
			}
			if (state == 0) {
				this.messageReturn = "Frd missing";
				this.result= 0;
			}
			if (state != 2 && state != 3) {
				this.messageReturn = "B/G missing";
			}

			if (state == 2) {
				if (this.receiver == 8088)
					this.result= 2;
				else
					this.messageReturn = "you must send to 8088";
			}
			if (state == 3) {
				if (this.receiver == 8088)
					this.result= 3;
				else
					this.messageReturn = "you must send to 8088";
			}
		}
		if (index == 0) {
			
			if (state == 0) {
				this.messageReturn = "Frd missing";
				if(this.receiver!=8011) this.messageReturn+=" You must send to 8011";
				this.result= 0;
			}

			if (state != 10 && state != 9 && state != 8) {
				this.messageReturn = "RJ missing.You should send \"Frd RJ B\" or \"Frd RJ G\" to 8011";
			}
			if (state == 8)
				{this.messageReturn = "B/G missing";
				if(this.receiver!=8011) this.messageReturn+=" You must send to 8011";

				}
			if (state == 10) {
				if (this.receiver == 8011)
					this.result= 10;
				else
					this.messageReturn = "you must send to 8011";
			}

			if (state == 9) {
				if (this.receiver == 8011)
					this.result= 9;
				else
					this.messageReturn = "you must send to 8011";
			}

		}
		if (index == 1 || index == 2 || index == 3) {
			if (state == 0) {
				this.messageReturn = "Frd missing";
				this.result= 0;
			}
			if (gender == "boy") {
				if (this.receiver == 8088) {
					if (state != 5 && state != 12 && state != 2) {
						this.messageReturn = "B/G missing";
						this.result= 0;
					}
					if (state == 2) {

						this.result= 2;

					}
					

				}
				if (this.receiver == 8011) {
					if (state != 5 && state != 12 && state != 2) {
						this.messageReturn = "del missing";
						this.result= 0;
					}
					if (state == 5) {

						this.result= 5;

					}
					

				}
				if (this.receiver == 8033) {
					if (state != 5 && state != 12 && state != 2) {
						this.messageReturn = "chg missing";
						this.result= 0;
					}
					if (state == 12) {

						this.result= 12;

					}
					

				}

			}
			if (gender == "girl") {
				if (this.receiver == 8088) {
					if (state != 5 && state != 12 && state != 3) {
						this.messageReturn = "B/G missing";
						this.result= 0;
					}
					if (state == 3) {

						this.result= 3;

					}
					

				}
				if (this.receiver == 8011) {
					if (state != 5 && state != 12 && state != 3) {
						this.messageReturn = "del missing";
						this.result= 0;
					}
					if (state == 5) {

						this.result= 5;

					}
					

				}
				if (this.receiver == 8033) {
					if (state != 5 && state != 12 && state != 3) {
						this.messageReturn = "chg missing";
						this.result= 0;
					}
					if (state == 12) {

						this.result= 12;

					}
					

				}
				else if(state==5)this.messageReturn = "You must send to 8011";
				
				else if (state == 5)
					this.messageReturn = "You must send to 8011";
				else if (state == 12)
					this.messageReturn = "You must send to 8033";
			}

		}
		if(this.messageReturn==null) this.messageReturn="wrong format";

		this.result= 0;

	}

	public static void main(String[] args) {
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
