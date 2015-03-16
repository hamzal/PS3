package PS3_HL;

public class Test {
	public static void main(String[] args) {
		Account Account_Test = new Account();
		Account_Test.setid(1122);
		Account_Test.setBalance(20000);
		Account_Test.setannualInterestRate(4.5);
		Account_Test.deposit(3000);
		System.out.println("your balance is:" + Account_Test.getBalance());
		System.out.println("This account's monthly interest rate is:"
				+ Account_Test.getMonthlyInterestRate() + "%");
		System.out.println("This account was created on: "
				+ Account_Test.getdateCreated());
		try {
			System.out.println("Amount Withdrawn: $"
					+ Account_Test.withdraw(200.00));
			System.out.println("Amount Withdrawn: $"
					+ Account_Test.withdraw(600.00));
			
			Account_Test.withdraw(23000.00);
		} catch (InsufficientFundsException e) {
			System.out
					.println("Sorry, you have insufficient funds, you need: $"
							+ e.getAmount());
			e.printStackTrace();
		}

	}

}
