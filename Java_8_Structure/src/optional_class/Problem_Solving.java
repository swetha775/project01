package optional_class;

interface A
{
	default void add()
	{
		System.out.println("Gom");
	}
}

interface B
{
	default void add()
	{
		System.out.println("Swe");
	}
}

public class Problem_Solving implements A ,B
{
	public static void main(String[] args) 
	{
		Problem_Solving obj = new Problem_Solving();
		obj.add();

	}

	@Override
	public void add() {
		B.super.add();
		A.super.add();
	}

}
