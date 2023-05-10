package Kursova;

import java.util.ArrayList;

public class Magazine implements Comparable<Magazine>{
	protected String magName;
	private ArrayList<Article> list;
	
	public Magazine(String magName, ArrayList<Article> list) {
		super();
		this.magName = magName;
		this.list = list;
	}
	
	public String getMagName() {
		return magName;
	}


	public void setMagName(String magName) {
		this.magName = magName;
	}


	public ArrayList<Article> getList() {
		return list;
	}


	public void setList(ArrayList<Article> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Magazine Name: " + magName + ",Article: " + list;
	}

	@Override
	public int compareTo(Magazine o) {
	
		return this.getMagName().compareTo(o.getMagName());
	}

}

