package prob2;

public class Account {
	String accountNo ;
	int balance = 0;
	
	public Account () {
	}
	
	public Account( String accountNo ){
		setAccountNo( accountNo ); //왜 안될까? setAccountNo 이용 하고 싶은데
		//this.accountNo = accountNO; 
		System.out.println( this.accountNo + "계좌가 개설되었습니다.");
	}
	
	public void save( int a ){
		int input = a;
		this.balance += a;
		System.out.println( this.accountNo + "계좌에 " + input + "만원이 입금되었습니다.");
	}

	public void deposit( int b ){
		int output = b;
		this.balance -= b;
		System.out.println( this.accountNo + "계좌에 " + output + "만원이 출금되었습니다.");
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
		
	
}
