package Kursova;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Article {
	private Author authorinfo;
	private String title;
	private LocalDate publishDate;
	
	public Article(Author authorinfo, String title, LocalDate publishDate) {
		this.authorinfo = authorinfo;
		this.title = title;
		this.publishDate = publishDate;
	}
	public Article() {
		this.authorinfo=new Author();
		this.title="Title1";
		this.publishDate = LocalDate.now();
	}
	public Author getAuthorinfo() {
		return authorinfo;
	}
	public void setAuthorinfo(Author authorinfo) {
		this.authorinfo = authorinfo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDate() {
		return publishDate;
	}
	public void setDate(LocalDate date) {
		this.publishDate = date;
	}
	
	
	@Override
	public String toString() {
		return "Article: " + authorinfo + ", title=" + title + ", publishDate=" + publishDate;
	}
}