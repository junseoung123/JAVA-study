package ch09;

import java.util.Map;
import java.util.TreeMap;



public class GenericEx09 {

	public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        
        box1.set(new Integer(100));
        Integer aa = (Integer) box1.get();
        System.out.println(aa);
        
        box2.set("ȫ�浿");
        
        GBox<Integer> gbox1 = new GBox<Integer>();
        gbox1.set(new Integer(10));
        
        //659
        Product<String, Integer> p1 = new Product<String, Integer>("Computer", 500);
        
        new Product<String, String>("kk", "aa");
        
        System.out.println( Util.boxing("ȫ�浿"));
		

	}

}

interface Inter01<T, P, S> {
	abstract T t();
	P p();
	S s();
}

class Util{
	public static <T> GBox<T> boxing(T t) {
		GBox<T> box = new GBox<T>();
		box.set(t);
		return box;
		
	}
}
class InterClass implements Inter01<String, Integer, Boolean> {
	@Override
	public Integer p() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean s() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String t() {
		// TODO Auto-generated method stub
		return null;
	}
}


class Product<T,M> {
	T kind;
	M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public Product(T kind, M model) {
		super();
		this.kind = kind;
		this.model = model;
	}
	
}

class GBox<T> {
	T t;
	void set(T t) {
		this.t = t;
	}
	T get() {
		return t;
	}
	
}

class Box{
	Object o;
	void set(Object o) {
		this.o = o;
		
		
	}
	
	Object get() {
		return o;
	}
}
