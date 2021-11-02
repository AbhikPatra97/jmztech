package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Bank3 {		//fetch data by name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		int age = 0;
		String gender = "";
		String bank = "";
		long cardnumber = 0;
		int creditlimit = 0;		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		String nameCheck = sc.next();		
		File f = new File("bankaccount.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = null;
			System.out.print(" Name ");
			System.out.print(" Age ");
			System.out.print(" Gender ");
			System.out.print(" Bank ");
			System.out.print(" Card_Number ");
			System.out.println(" Credit_Limit");
			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				name = temp[0];
				age = Integer.parseInt(temp[1]);
				gender = temp[2];
				bank = temp[3];
				cardnumber = (int) Long.parseLong(temp[4]);
				creditlimit = Integer.parseInt(temp[5]);
				
				if (temp[0].equalsIgnoreCase(nameCheck)) {
					
					System.out.print(" " + name + " ");
					System.out.print(" " + age + " ");
					System.out.print("   " + gender + " ");
					System.out.print("    " + bank + " ");
					System.out.print("   " + cardnumber + " ");
					System.out.println("      " + creditlimit + " ");
					
				}
				
		
			}
			br.close();
			
		}
				
				
			
				

				
			
			
			
			//suhelbr.close();
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

