

import java.util.ArrayList;
import java.util.Scanner;

public class VerifyEmail {

	
	public static void main(String[] args) {
		//Arraylist containing a list of email ids
		ArrayList<String> emailList = new ArrayList<String>();

		emailList.add("john.smith@gmail.com");
		emailList.add("honey.bee@hotmail.com");
		emailList.add("john_sugar@gmail.com");
		emailList.add("may.flower@gmail.com");
		emailList.add("anna.smith@yahoo.com");
		emailList.add("water_melon@gmail.com");
		emailList.add("jingle.bells02@gmail.com");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the email id");
		String email = sc.next();

		if(emailList.contains(email))
			System.out.println(email+" is present");
		else 
			System.out.println(email+" is not present");
		sc.close();
	}

}
