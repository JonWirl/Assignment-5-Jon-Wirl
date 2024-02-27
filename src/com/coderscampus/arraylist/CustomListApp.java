package com.coderscampus.arraylist;

public class CustomListApp {

	public static void main(String[] args) {
		
		CustomList<String> newList = new CustomArrayList<>();
		
		for (int i = 1; i <= 30; i++) {
			newList.add("element" + i);
			
		}
		
		for (int i = 0; i < newList.getSize(); i++) {
			System.out.println(newList.get(i));
		}


	}

}
