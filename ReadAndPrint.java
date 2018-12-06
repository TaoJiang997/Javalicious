import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadAndPrint {
	
	public static void main(String[] args) {
		int totalChar = 0;
		int wordCount = 0;
		
		//This ArrayList is where the individual words will be stored.
		ArrayList<String> list = new ArrayList<String>();
		
		/*Creates and scans through a new text file word by word. This function will also be counting the number of words in the text file as
		 well as the number of characters in a given text file.*/
		try{
			File file = new File("text.txt");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner (file);{
			while(scan.hasNext()) {
				String word = scan.next();
				list.add(word);
				totalChar += word.length();
				wordCount++;
					}
				}
			}
		//Tries to catch errors that may have occurred during the scanning.
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(@SuppressWarnings("hiding") IOException e2) {
			e2.printStackTrace();
		}
		
		/*This for-loop will print out every word that is in the text document in a new line and the other two print line will print the
		total amount of words and characters in the text file.*/
		for(int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		 }
		System.out.println("The character count of this text file is:  " + totalChar);
		System.out.println("The word count of this text file is: " + wordCount);
	 }
}
	





