package ch02;

public class StorageImpl<T,M> implements Storage<T>{
	M m;
	private T[] array;
	
	public StorageImpl() {
		
	}
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
		
	}
	
	
	
	public void add(T item, int index) {};
	
	@Override
	public T get(int index) {
		
		return null;
	}
	
    
	
	

}
