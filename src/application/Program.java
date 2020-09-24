package application;

import java.util.Locale;

import model.entities.Account;
import model.exception.customException;

public class Program {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		
		try {
			
			Account account = new Account(2533, "Wagner", 600.00, 300.0);
			account.withdraw(250.0);
		
			System.out.println(account);
			
		}
		catch(customException e) {
			System.out.println("Error: "+ e.getMessage());
			
		}
		
	}

}
