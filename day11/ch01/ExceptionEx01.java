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
	//����
	public void deposit(int money) {
		balance += money;
	}
	//���
	/*public void withdraw(int money) throws BankException{
		if(balance < money) {
			throw BankException( (money - balance) + "�ܾ��� �����մϴ�. �ٽ� ��ݾ��� �Է����ּ���")
		}else {
			balance-=money;
			System.out.println("������ ���¿���" + money + "�ݾ��� ����մϴ� �ܾ��� " + balance);
		}*/
	}

