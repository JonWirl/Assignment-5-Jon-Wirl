package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			
//			doubling array size
			
			int newSize = items.length * 2;
			
			Object[] newArray = new Object[newSize];
			
			for (int i = 0; i < size; i++) {
				newArray[i] = items[i];
			}
			
			items = newArray;
	
		}
		items[size++] = item;
		return false;
	}

	@Override
//	the original code returned 0, changed to return sizeeee
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}

		return (T) items[index];
	}
	
}