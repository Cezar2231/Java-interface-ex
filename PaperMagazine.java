package Kursova;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaperMagazine extends Magazine {
	private Frequency post;
	private int number;
	private LocalDate OutDate;
	
	public PaperMagazine(String magName, ArrayList<Article> list, Frequency post, int number, LocalDate outDate) {
		super(magName, list);
		this.post = post;
		this.number = number;
		OutDate = outDate;
	}

	public Frequency getPost() {
		return post;
	}

	public void setPost(Frequency post) {
		this.post = post;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getOutDate() {
		return OutDate;
	}

	public void setOutDate(LocalDate outDate) {
		OutDate = outDate;
	}

	@Override
	public String toString() {
		return "PaperMagazine Name: "+magName+" [post:" + post + ", number: " + number + ", OutDate: " + OutDate + "]";
	}
	public String toShortString() {
		return super.toString()+" PaperMagazine Post: "+post+"OutDate: "+OutDate;
	}
	
	
}
