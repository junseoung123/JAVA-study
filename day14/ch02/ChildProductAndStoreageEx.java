package ch02;

public class ChildProductAndStoreageEx {

	public static void main(String[] args) {
		// 669
		
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		Storage<Tv> storeage = new StorageImpl<Tv,String>();
		storeage.add(new Tv(), 1);
		Tv tv = storeage.get(0);

	}

}