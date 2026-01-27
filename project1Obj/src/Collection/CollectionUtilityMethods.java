package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User implements Comparable<User>
{
	int id;
	String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Compare by String using comparator
	@Override
	public int compareTo(User o) 
	{
		return this.name.compareToIgnoreCase(o.name);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}

public class CollectionUtilityMethods 
{
	//Collection Utility Methods -> only allowed lists
	public static void main(String[] args) 
	{
		List<Integer> list =  List.of(2,3,2,5,76,3,36);
		List<Integer> li =  List.of(23,3,2,5,76,3,3);
		ArrayList<Integer> al = new ArrayList<>(list);
		ArrayList<Integer> h = new ArrayList<>(li);
		
//		ArrayList<User> all = new ArrayList<>();
//		
//		//Anther to Compare using Comparator -> sort();
//		Comparator<User> custom = new Comparator<>()
//		{
//			@Override
//			public int compare(User o1, User o2) 
//			{	
//				return o1.name.compareToIgnoreCase(o2.name);
//			}
//		};
//		
//		all.add(new User(6,"F"));
//		all.add(new User(4,"C"));
//		
//		Collections.sort(all , custom);
//		System.out.println(all);
//		
//		Collections.sort(al);
//		System.out.println(al);
//		
//		System.out.println(Collections.binarySearch(al, 76));
//		
//		System.out.println(Collections.min(al));
//		System.out.println(Collections.min(all, custom));
//		
//		System.out.println(Collections.max(al));
//		System.out.println(Collections.max(all, custom));
//		
//		System.out.println(Collections.frequency(al, 3)); //2
//		
//		System.out.println(Collections.disjoint(h, al)); //false(match)
//		
//		Collections.reverse(al);
//		
//		Collections.shuffle(al);
//		
//		Collections.fill(al, 5);
//		
		//Collections.copy(al, h);
		
		List<Integer> l =Collections.unmodifiableList(al); //Immutable
		//l.add(7); UnsuportedException
		System.out.println(l);
		
		List<Integer> lii =Collections.synchronizedList(al);
		System.out.println(lii);
		
		List<Integer> i =Collections.emptyList();
		System.out.println(i);
		
		List<Integer> in = Collections.singletonList(9); //one entry should allowed
		in.add(54); //UnsuportedException
		System.out.println(in);

	}

}
