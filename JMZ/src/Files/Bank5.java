package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bank5 {		// sort by acc. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		int age = 0;
		String gender = "";
		String bank = "";
		long cardnumber = 0;
		int creditlimit = 0;
		String line = null;
		
		File f = new File("bankaccount.txt");
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
					
					list.add(temp[0]);
					list.add(temp[1]);
					list.add(temp[2]);
					list.add(temp[4]);
					list.add(temp[5]);
					System.out.println(list);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

	}

}
