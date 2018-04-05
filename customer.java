public class Customer {

	

		private String firstName;
		private String lastName;
		private String accountNumber;
		private double accountBalance;

		public Customer(String fname, String lname)
		{ firstName = fname;
		lastName = lname;
		}
		public Customer (String fname, String lname, double balance, String acctnumber )
		{ firstName = fname;
		lastName = lname;
		accountNumber = acctnumber;
		accountBalance = balance;
		}

		public void setFirstName(String fname)
		{ firstName = fname; }

		public String getFirstName()
		{ return firstName;}

		public void setLasttName(String lname)
		{ lastName = lname; }

		public String getLastName()
		{ return lastName;}

		public void setAccountBalance(double InitialBalance) 
		{ accountBalance = InitialBalance;   }

		public double getInitialBalance() {
		return accountBalance;
		}

		public void setAccountNumber(String accountN) 
		{ accountNumber = accountN;}

		public String getNewAccountNumber() {
		return accountNumber;
		}



		public void deposit ( double deposit)
		{  accountBalance +=deposit;    
		}

		public void withdraw ( double withdraw)
		{  accountBalance -=withdraw;    
		}

		public boolean equals(String acctnumber){
		return accountNumber.equals(acctnumber);
		}
		public int compareTo (Customer other)
		{ int b = this.lastName.compareTo(other.lastName);
		if (b!=0) return b;
		b = this.firstName.compareTo(other.firstName);
		if (b != 0)
		return b;
		return (this.accountNumber).compareTo(other.accountNumber);

		}

public String toString(){
		String str = "fname + lname + accountBalance";
		}

		// part 22222222222222222222222222222222222222222222222222222222222222222222222

		Customer[] bank = new Customer[10];
