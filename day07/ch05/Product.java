package ch05;

public class Product {
	
	String[] productName = {"ȭ��ǰ", "������ǰ", "�繫��ǰ"}; //��ǰ
	String[] cosmetics = {"����ƽ", "��", "��Ǫ"}; //ȭ��ǰ
	String[] homeAppliances = {"�鵵��","��ǳ��", "������"}; //������ǰ
	String[] OfficeSupplies = {"A4����","��Ʈ", "��"}; //�繫��ǰ
	
	
	String[] productKind = new String[100];
	String[] productName2 = new String[100];
	int[] amount = new int[100];
	int[] take = new int [100];
	
			
	public String[] getProductName() {
		return productName;
	}
	public void setProductName(String[] productName) {
		this.productName = productName;
	}
	
	public String[] getCosmetics() {
		return cosmetics;
	}
	public void setCosmetics(String[] cosmetics) {
		this.cosmetics = cosmetics;
	}
	
	public String[] getHomeAppliances() {
		return homeAppliances;
	}
	public void setHomeAppliances(String[] homeAppliances) {
		this.homeAppliances = homeAppliances;
	}
	
	public String[] getOfficeSupplies() {
		return OfficeSupplies;
	}
	public void setOfficeSupplies(String[] officeSupplies) {
		OfficeSupplies = officeSupplies;
	}
	
	public String[] getProductKind() {
		return productKind;
	}
	public void setProductKind(String[] productKind) {
		this.productKind = productKind;
	}
	public String[] getProductName2() {
		return productName2;
	}
	public void setProductName2(String[] productName2) {
		this.productName2 = productName2;
	}
	public int[] getAmount() {
		return amount;
	}
	public void setAmount(int[] amount) {
		this.amount = amount;
	}
	public int[] getTake() {
		return take;
	}
	public void setTake(int[] take) {
		this.take = take;
	}
	
	//�⺻������ Product()
	//�����Ϸ��� �����ڰ� �ƹ��͵� ������ �⺻�����ڸ� �ڵ����� ������ش�
	//�׷��� ����� �����ڸ� ���α׷��� �ָ� �⺻�����ڴ� ������ �ʴ´�
	public Product() {
		
	}
	//����� ������
	public Product(String[] productName, String[] cosmetics, String[] homeAppliances, String[] officeSupplies) {
		//super();
		this.productName = productName;
		this.cosmetics = cosmetics;
		this.homeAppliances = homeAppliances;
		OfficeSupplies = officeSupplies;
	}
	

}
