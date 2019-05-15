package assignments.assignment1;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
	 private static Scanner s;

	public static void main(String[] args) {
	       String s1,s2,s3;
	       s = new Scanner(System.in);
	       System.out.println("Enter your name: ");
	       s1=s.nextLine();
	       System.out.println("Enter your address: ");
	       s2=s.nextLine();
	       System.out.println("Enter your phone: ");
	       s3=s.nextLine();
	       
	       try {
	            File f1 = new File("file1.txt");

	            FileWriter fw = new FileWriter(f1);
	            fw.write(s1);
	            fw.write("\n"+s2);
	            fw.write("\n"+s3);
	            fw.close();
	            
	            System.out.println("Written to file Successfully");
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	    }
}
