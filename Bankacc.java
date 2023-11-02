

class Account{
		int acc_id;
		String acc_name;
		float amount;
	Account(int id , String name , float amt ){
		acc_id = id;
		acc_name = name;
		amount = amt;
	}
	void display() {
		System.out.print(acc_id + " ");
		System.out.print(acc_name + " ");
		System.out.println(amount );
		}
	
	void deposit(float amt ) {
		amount = amount+amt;
		System.out.println(amt + " deposited");
		
	}	
    void checkbalance() {
    	System.out.println("balance is :" + amount);
    }
    void withdraw(float amt) {
    	amount = amount-amt;
    	System.out.println(amt  + "  withdrawn" );
    }
	}
	public class Bankacc {
	public static void main(String[] args) {
		Account b1 = new Account(1234, "joshua", 1000);
		b1.display();
	    b1.checkbalance();
	    b1.deposit(40000);
	    b1.checkbalance();
	    b1.withdraw(15000);
	    b1.checkbalance();

	}

}
