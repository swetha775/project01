package CollectionFrameworks;

import java.io.Serializable;

public class Products implements Serializable
{
	private static final long serialVersionUID = 101L;
	
	private int id;
	private String productName;
	private String category;
	private long price;
	
	public Products(int id , String productName , String category , long price)
	{
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	
	public String getproductName()
	{
		return productName;
	}
	
	
	public void display()
	{
		System.out.println("id: "+id);
		System.out.println("productName: "+productName);
		System.out.println("category: "+category);
		System.out.println("price: "+price);
	}

}
