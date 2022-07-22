import java.util.ArrayList;
import java.util.Scanner;
package Verification;
public class Main {
	public static void main(String[] args) {
	    ArrayList<String> address = new ArrayList<String>();
		  address.add("vyshnavi@gmail.com");
          address.add("sravani@gmail.com");
		 Scanner input = new Scanner(System.in);  
		 System.out.println("enter your email id");
		      String S= input.nextLine();
	        
	          if(address.contains(S)) 
	          {
	        	  System.out.println("your email id is " + S +"found");
	          }
	          else
	          {
	        	 System.out.println("your email id id" + S +"not found");
	        
	           }
          }
}	 
	  