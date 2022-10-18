package ch01;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account ac = new Account();
		ac.setBalance(1000);
		
		//ac.withdraw(500);

	}

}

class Account {
	private long balance;
	public Account() {
		
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	//예금
	public void deposit(int money) {
		balance += money;
	}
	//출금
	/*public void withdraw(int money) throws BankException{
		if(balance < money) {
			throw BankException( (money - balance) + "잔액이 부족합니다. 다시 출금액을 입력해주세요")
		}else {
			balance-=money;
			System.out.println("귀하의 계좌에서" + money + "금액을 출력합니다 잔액은 " + balance);
		}*/
	}

