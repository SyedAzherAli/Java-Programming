import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedreader {
       public static void main(String[] args) 
       throws IOException  { 

       // creatin an object 
       BufferedReader strr = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name :");
       // taking input from the user 
       String userinpt = strr.readLine();
    
       System.out.println("Enter your age :");
       int num = Integer.parseInt(strr.readLine());  

       // print user value name 	
       System.out.println("NAME : " + userinpt);
       System.out.println("AGE : " + num);
	
       }
}       


		       
