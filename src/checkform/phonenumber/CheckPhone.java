package checkform.phonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhone {
 String phone;
	
	
	public CheckPhone(String x) {
 this.phone=x;
		// TODO Auto-generated constructor stub
	}
	
	public  boolean isValidE123() 
	{ 
		Pattern p = Pattern.compile("(09)?[0-9]{8}"); 
 
		Matcher m = p.matcher(this.phone); 
		return (m.find() && m.group().equals(this.phone)); 
	} 
 
	public static void main(String[] args) 
	{ 
		CheckPhone phone1= new CheckPhone("0913423546");
		
if(phone1.isValidE123()) System.out.println("ok");
else  System.out.println(" not ok");
 
		 
	} 

}
