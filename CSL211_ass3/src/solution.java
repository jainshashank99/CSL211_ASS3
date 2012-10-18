import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class solution {

	public static int BHR;
	public static int PC;
	
	public static void main(String[] args) throws IOException {
		BufferedReader trace = new BufferedReader(new FileReader("trace.txt"));
		BufferedReader ins = new BufferedReader(new FileReader("instruction.txt"));
		
		String data = trace.readLine();
		String instruction = ins.readLine();
		Scanner s1 = new Scanner(data);
		Scanner s2 = new Scanner(instruction);
		
		String pc_string = s1.next();
		
		//String pc_string = s2.next();
		int type = s2.nextInt();
		int rs = s2.nextInt();
		int rt = s2.nextInt();
		int rd = s2.nextInt();
	}

}
