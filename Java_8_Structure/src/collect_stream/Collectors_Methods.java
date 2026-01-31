package collect_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
	private Integer id;
	private String productName;
	private String category;
	private Integer price;
	
	public Product(Integer id, String productName, String category, Integer price) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	
	public Integer getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public String getCategory() {
		return category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Poduct {id=" + id + ", productName=" + productName + ", category=" + category + ", price=" + price
				+ "}";
	}
}

public class Collectors_Methods
{

	public static void main(String[] args) 
	{
		ArrayList<Product> arr = new ArrayList<>(List.of(
				new Product(101 , "stone" , "D" , 8000),
				new Product(102 , "stone" , "A" , 4000),
				new Product(103 , "stone" , "C" , 200),
				new Product(104 , "stone" , "A" , 2000),
				new Product(105 , "stone" , "B" , 6000),
				new Product(106 , "stone" , "C" , 9000),
				new Product(107 , "stone" , "A" , 23000)
				));
		
		//Grouping
		Map<String , List<String>> map = arr.stream()
				.collect(Collectors.groupingBy((x) -> x.getCategory(), //1 parameter
						() ->new LinkedHashMap<>(),  //3 parameter
						Collectors.mapping((x) -> x.getProductName(),  //2 parameter
								Collectors.toList())
						));
		System.out.println(map);
		
		//Partitioning
		Map<Boolean , List<Product>> map1 = arr.stream()
				.collect(Collectors.partitioningBy((x) -> x.getPrice()<= 6000));
		System.out.println(map1);

		Map<Boolean , List<Integer>> map2 = arr.stream()
				.collect(Collectors.partitioningBy((x)->x.getPrice() <= 6000, 
				Collectors.mapping((x)->x.getId(), Collectors.toList())
				));
		
		System.out.println(map2);
		
		//ToMap
		
		//DD=2, VV=2, SSS=3, C=1, AAAA=4 -> Predefined
		Map<String , Integer>map3 = Stream.of("DD","C","VV","AAAA","SSS")
		.collect(Collectors.toMap((x)->x, (y)->y.length()));
		
		System.out.println(map3);
		
		//UserDefined
		Map<String , Integer>map4 = arr.stream()
				.collect(Collectors.toMap((x)->x.getProductName(), 
				(y)->y.getPrice(),(o,n)->n));     //Same key -> throw exception-> so using 3 Parameter
		
		System.out.println(map4);
		
		Map<String , Integer>map5 =arr.stream()
		.collect(Collectors.toConcurrentMap((x)->x.getProductName(), 
				(y)->y.getPrice(),(o,n)->o));
		System.out.println(map5);
		
		//filtering
		List<String>l1 = Stream.of("one","two","three","four","five")
		.collect(Collectors.filtering((x)->x.length() == 3, 
		Collectors.toList()));
		System.out.println(l1);
		
		//Predefined
		List<Integer> l2 = arr.stream()
				.collect(Collectors.filtering((x)->x.getId()<103, 
						Collectors.mapping((x)->x.getId(), 
								Collectors.toList())));
		System.out.println(l2);
		
		//FlatMapping
		
		String[] str = {"one,two" , "three,four" , "five,six"};
		String l3 = Arrays.stream(str)
				.collect(Collectors.flatMapping((x)->Arrays.stream(x.split(",")), 
				Collectors.joining(",", "{", "}")));
		System.out.println(l3);
		
		
	}

}
