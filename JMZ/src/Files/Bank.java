package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bank {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String name="";
		int age = 0;
		String gender = "";
		String bank = "";
		long cardnumber = 0l;
		int creditlimit = 0;
		long cardnumber1 = 0l;
		String transactiondate = "";
		int amount = 0;
		
		File f = new File("bankaccount.txt");
		f.createNewFile();
		File f1 = new File("banktransactions.txt");
		f1.createNewFile();

		BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedReader br1 = new BufferedReader(new FileReader(f1));
		
		String line = null;
		System.out.println("Reading 1st file");
		System.out.println("********************");
		while ((line = br.readLine()) != null) {
			String temp[] = line.split(",");
			name = temp[0];
			age = Integer.parseInt(temp[1]);
			gender = temp[2];
			bank = temp[3];
			cardnumber = Long.parseLong(temp[4]);
			creditlimit = Integer.parseInt(temp[5]);

			System.out.println("Name : " +name);
			System.out.println("Age : " +age);
			System.out.println("Gnder : " +gender);
			System.out.println("Bank : " +bank);
			System.out.println("Card_Number : " +cardnumber);
			System.out.println("Credit_Limit : " +creditlimit);
			System.out.println("----------------");

		}
		System.out.println();
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println();
		
		System.out.println("Reading 2nd file");
		System.out.println("********************");
		while ((line = br1.readLine()) != null) {
			String temp[] = line.split(",");
			cardnumber1 = Long.parseLong(temp[0]);
			transactiondate = temp[1];
			amount = Integer.parseInt(temp[2]);

			System.out.println("Card_Number : " +cardnumber1);
			System.out.println("Transaction_Date : "+transactiondate);
			System.out.println("Amount : "+amount);
			System.out.println("-------------------");

		}
		br.close();
		br1.close();
	}

}
