import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class Controller {
	
	public void run(){
		startUpSequence();
	}
	
	public void writeToFile(){
		System.out.print(" First Name, Id, Position, Name of supervisor (Id of supervisor), Salary:");
	    Scanner scan = new Scanner(System.in);
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
	
	public void startUpSequence(){
		System.out.println("Program started");
	}
}
