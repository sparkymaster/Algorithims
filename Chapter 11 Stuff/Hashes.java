import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/*
 * Edited by Parker Evans began by Dr. Barker
 * 
 * 2/8/2020, 
 * This assignment is used for comparing the runtimes of using arrays vs hashtables for the insert and search times;
 * 
 * 
 * 
 * 
 */


public class Hashes {

	public static void main(String[] args) {

		//You might need to read the encoding as UTF-8
		//Scanner in = new Scanner(new File("Shakespeare_20_percent.txt"), "UTF-8");
		//But maybe not
		//Scanner in = new Scanner(new File("Shakespeare_20_percent.txt"));

		
		//Add something to an ArrayList, see if we can find it
		ArrayList<String> a = new ArrayList<String>();
		//a.add("Hello");

		//Scanner in = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		//System.out.println("Type Hello");
		//Scanner in = new Scanner(new File("Shakespeare_20_percent.txt"));
		Scanner in;
		Scanner in2;
		
		
		
		try {
			
			in = new Scanner(new File("Shakespeare_100_percent.txt"), "UTF-8");
			
			String str;
			while(in.hasNext()) {
			
			str = in.next();
			str = str.replaceAll("[^a-zA-Z0-9]", ""); //gets rid of everything except a-Z and 0-9
			
			if(a.contains(str)) {
				System.out.println("It was there");
				
			}
			else {
				System.out.println("We didn't find that word");
				a.add(str);
			}
			}
			
			
			
			
			in.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			
			in2 = new Scanner(new File("Shakespeare_100_percent.txt"), "UTF-8");
			
			String str2;
			while(in2.hasNext()) {
			
				str2 = in2.next();
				str2 = str2.replaceAll("[^a-zA-Z0-9]", ""); //gets rid of everything except a-Z and 0-9
			
				if(h.containsKey(str2)) {
					System.out.println("It was there");
				
				}
				else {
					System.out.println("We didn't find that word");
					h.put(str2, 1);
				}
			
			}
			
			in2.close();
			
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
		
		
		
		
		
		
		
	}
	
}
