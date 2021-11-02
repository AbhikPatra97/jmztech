package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bank2 {		//Group by bank

	static void m1() {
		String name = "";
		int age = 0;
		String gender = "";
		String bank = "";
		long cardnumber = 0l;
		int creditlimit = 0;
		String line = null;
		String bank1 = "hdfc";
		
		File f = new File("bankaccount.txt");
		System.out.println(bank1);
		System.out.println("[Name, Age,Gender,Card,Limit]");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));

			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				name = temp[0];
				age = Integer.parseInt(temp[1]);
				gender = temp[2];
				bank = temp[3];
				cardnumber = Long.parseLong(temp[4]);
				creditlimit = Integer.parseInt(temp[5]);
				ArrayList<Object> list = new ArrayList<Object>();
				
				if (temp[3].equals(bank1)) {
					
					list.add(temp[0]);
					list.add(temp[1]);
					list.add(temp[2]);
					list.add(temp[4]);
					list.add(temp[5]);
					System.out.println(list);

				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

	}

	static void m2() {

		String name = "";
		int age = 0;
		String gender = "";
		String bank = "";
		long cardnumber = 0l;
		int creditlimit = 0;
		String line = null;
		String bank2 = "sbi";
		
		File f = new File("bankaccount.txt");
		System.out.println(bank2);
		System.out.println("[Name, Age,Gender,Card,Limit]");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));

			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				name = temp[0];
				age = Integer.parseInt(temp[1]);
				gender = temp[2];
				bank = temp[3];
				cardnumber = Long.parseLong(temp[4]);
				creditlimit = Integer.parseInt(temp[5]);

				ArrayList<Object> list1 = new ArrayList<Object>();
				
				if (temp[3].equals(bank2)) {
					
					list1.add(temp[0]);
					list1.add(temp[1]);
					list1.add(temp[2]);
					list1.add(temp[4]);
					list1.add(temp[5]);
					System.out.println(list1);
				}

			}


						
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}
	

	static void m3() {

		String name = "";
		int age = 0;
		String gender = "";
		String bank = "";
		long cardnumber = 0l;
		int creditlimit = 0;
		String line = null;
		String bank3 = "idfc";
		
		File f = new File("bankaccount.txt");
		System.out.println(bank3);
		System.out.println("[Name, Age,Gender,Card,Limit]");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));

			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				name = temp[0];
				age = Integer.parseInt(temp[1]);
				gender = temp[2];
				bank = temp[3];
				cardnumber = Long.parseLong(temp[4]);
				creditlimit = Integer.parseInt(temp[5]);

				ArrayList<Object> list2 = new ArrayList<Object>();
				
				if (temp[3].equals(bank3)) {
					
					list2.add(temp[0]);
					list2.add(temp[1]);
					list2.add(temp[2]);
					list2.add(temp[4]);
					list2.add(temp[5]);
					System.out.println(list2);
				}

			}


						
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank2.m1();
		Bank2.m2();
		Bank2.m3();

	}

}