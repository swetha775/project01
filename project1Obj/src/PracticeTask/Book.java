package PracticeTask;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable
{
	private int id;
	private String bookName;
	private String authorName;
	private long publishingYear;
	
	public Book(int id, String bookName, String authorName, long publishingYear)
	{
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishingYear = publishingYear;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", publishingYear="
				+ publishingYear + "]";
	}

	public int getId() {
		return id;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public long getPublishingYear() {
		return publishingYear;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPublishingYear(long publishingYear) {
		this.publishingYear = publishingYear;
	}

	public static void displayOptions()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.createNewBook");
		System.out.println("2.delete");
		System.out.println("3.Sorting by BookName");
		System.out.println("4.updating");
		System.out.println("5.Using author name to get bookname");
	
		System.out.println("Enter Option..");
		int ch=scan.nextInt();
		executeOption(ch);	
	}	
	
	public static void executeOption(int ch)
	{
		switch(ch)
		{
		case 1:
			Emp.createBook();
		break;
		
		case 2:
			Emp.removeById();
		break;
		
		case 3:
			Emp.sortingBookName();
		break;
		
		case 4:
			Emp.updateUsingBookName();
		break;
			
		case 5:
			Emp.getByAuthorName();
		break;
			
			
		}
	}



	
}
