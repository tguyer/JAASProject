import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;


public class Controller {
	Scanner scan = new Scanner(System.in);
	static LoginContext lc;
	
	public void run(){
		int startChoice = startUpSequence();
		
		if (startChoice == 0){
			loginSequence();
		} else if (startChoice == 1){
			createAccountSequence();
		}
	}
	
	public void writeToFile(){
		System.out.print(" First Name, Id, Position, Name of supervisor (Id of supervisor), Salary:");
	    String text = scan.nextLine();
	    FileWriter fWriter = null;
	    BufferedWriter writer = null;
	    try {
	      fWriter = new FileWriter("src/employeeDB.txt", true);
	      writer = new BufferedWriter(fWriter);
	      writer.write(text);
	      writer.newLine();
	      writer.close();
	      System.out.println("DONE");
	    } catch (Exception e) {
	        System.out.println("Error!");
	    }
	    scan.close();
	}
	
	public int startUpSequence(){
		String startType = "";
		int returnNum;
		System.out.println("\t------ Welcome! ------");
		System.out.println("Please select one of the following:\n(L/l) - Login\n(C/c) - Create Account");
		startType = inLineScan();
		
		if (startType.equalsIgnoreCase("L")){
			returnNum = 0;
		} else {
			returnNum = 1;
		}
		return returnNum;
	}
	
	public void loginSequence(){
		CallBackHandlerExample cbe = new CallBackHandlerExample();

		try {
			lc = new LoginContext("JAASExample", cbe);
		} catch (LoginException e) {
			System.err.println("Failed login");
		}
	}
	
	public void createAccountSequence(){
		System.out.println("You elected to create a new account!");
	}
	
	public String inLineScan(){
		System.out.print(">>>$ ");
		return scan.next();
	}
}
