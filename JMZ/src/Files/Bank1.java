package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Bank1 {		// map bank transaction to each of card number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long cardnumber = 0;
		String transactiondate = "";
		int amount = 0;
		String line = null;
		String s = "";
		System.out.print("CardNumber: "+" Amount "+"  Date");
		System.out.println();
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		File f = new File("banktransactions.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				cardnumber = Long.parseLong(temp[0]);
				
				transactiondate = temp[1];
				amount = Integer.parseInt(temp[2]);
				s = "     " +amount + ", " + transactiondate;
				for (int i = 0; i <= 20; i++ ) {
					hash_map.put((int) cardnumber, s);
				}
			}
			hash_map.forEach((key, value) -> System.out.println(key + ":" + value));
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}