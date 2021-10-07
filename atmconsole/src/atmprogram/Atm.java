package atmprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import models.Account;

public class Atm {
	private Account initAcc;
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		String inputs = reader.readLine();
		String[] inputArray = inputs.split(" ");
		
		Atm atm = new Atm();
		atm.process(inputArray);
		
	}
	
	private void process(String[] arrInput) {
		if (arrInput[0] == "logout" ) {
			// getLogout();
		}
		if (arrInput[0].contains("login")) {
			Params params = new Params();
			params.setParCmd("login");
			params.setParSrc(arrInput[1]);
			getLogin(params);
			System.out.println("Hello, "+ initAcc.getName()+"!");
			System.out.println("Your balance is $" + initAcc.getBalance());
			
		}
		if (arrInput[0].contains("deposit")) {
			Params params = new Params();
			params.setParCmd("deposit");
			params.setParNom(Integer.parseInt(arrInput[1]));
			if (initAcc != null && initAcc.getIsLogin() == 1) {
				params.setParSrc(initAcc.getName());
			}
			getDeposit(params);
			System.err.println("Your balance is $" + initAcc.getBalance());
		}
		
	}
	
	private void getLogin(Params params) {
		if (initAcc == null) {
			Account account = new Account();
			account.setName(params.getParSrc());
			account.setBalance(0);
			account.setHasOwe(null);
			account.setHasClaim(null);
			account.setIsLogin(1);
			initAcc = account;
		}
		
	}
	
	private void getDeposit(Params params) {
		if (initAcc.getName().contains(params.getParSrc())) {
			int prevBalance = initAcc.getBalance();
			initAcc.setBalance(prevBalance + params.getParNom());
		}
		
	}
}
