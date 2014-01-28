import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Test{
	
	
	public static void main (String[] args) {
		
	    BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
	     String input = null;
	     boolean quitCommand = false;

	     while(!quitCommand) {
	         try {   
	             System.out.print("Give a command: ");
	            // input = is.readLine();
	             if((input=is.readLine())!=null){
	            	 System.out.println("input is NOT NULL 1");
	             }else{
	            	 System.out.println("input is NULL 1");
	             }

	             // As long as the command isn’t to quit:
	             if(input == null || "quit".equals(input.trim())){
	            	 System.out.println("input is NULL 2");
	            	 quitCommand = true;
	             }
	             if(quitCommand) {
	            	System.out.println("GOOD BYE!!!"); 
	            	break;
	             }
	             // get the next input line and handle it. (With handleCommand.)
	             String[] words = input.trim().split("\\s+");

	             // ** This is the original handleCommand line **
	             System.out.println(input + ":" + Arrays.toString(words));
	         } 
	         catch (Exception e) {
	             System.out.println("Something went wrong we are sorry try again.");
	             e.printStackTrace();
	         }
	     }
	}
}
