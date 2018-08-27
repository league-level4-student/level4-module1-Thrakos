package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] list;
	T[] oldList;
	
	public ArrayList() {
		
		list = (T[]) new Object[0];
		oldList = list;
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
		
	}
	
	public void add(T val) {
		
		list = (T[]) new Object[oldList.length + 1];
		
		for (int i = 0; i < oldList.length; i++) {
			list[i] = oldList[i];
		}
		
		list[list.length - 1] = val;
		
		oldList = list;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
		list = (T[]) new Object[oldList.length + 1];
		
		for (int i = 0; i < list.length; i++) {
			if (i < loc) {
				list[i] = oldList[i];
			} else if (i == loc) {
				list[i] = val;
			} else {
				list[i] = oldList[i-1];
			}
		}
		
		oldList = list;
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
		list = (T[]) new Object[oldList.length];
		
		for (int i = 0; i < list.length; i++) {
			if (i != loc) {
				list[i] = oldList[i];
			} else {
				list[i] = val;
			}
		}
		
		oldList = list;
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
		list = (T[]) new Object[oldList.length - 1];
		
		for (int i = 0; i < list.length; i++) {
			if (i < loc) {
				list[i] = oldList[i];
			} else {
				list[i] = oldList[i + 1];
			}
		}
		
		oldList = list;
		
	}
	
	public boolean contains(T val) {
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] == val) {
				return true;
			}
		}
		
		return false;
	}
}