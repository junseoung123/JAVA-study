package ch05;

public class Product {
	
	String[] productName = {"화장품", "가전제품", "사무용품"}; //제품
	String[] cosmetics = {"립스틱", "비누", "샴푸"}; //화장품
	String[] homeAppliances = {"면도기","선풍기", "전기담요"}; //가전제품
	String[] OfficeSupplies = {"A4용지","노트", "펜"}; //사무용품
	
	
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
	
	//기본생성자 Product()
	//컴파일러가 생성자가 아무것도 없으면 기본생성자를 자동으로 만들어준다
	//그런데 명시적 생성자를 프로그램해 주면 기본생성자는 만들지 않는다
	public Product() {
		
	}
	//명시적 생성자
	public Product(String[] productName, String[] cosmetics, String[] homeAppliances, String[] officeSupplies) {
		//super();
		this.productName = productName;
		this.cosmetics = cosmetics;
		this.homeAppliances = homeAppliances;
		OfficeSupplies = officeSupplies;
	}
	

}
