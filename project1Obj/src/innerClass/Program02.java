package innerClass;

public class Program02 
{
	private int id;
	private String name;
	private int x = 23;
	
	public Program02()
	{
	}
	
	public Program02(int id , String name)
	{
		this.id = id;
		this.name = name;
	
	}
	
	//------------------Static inner class----------------
	static class InnerSample
	{
		Program02 obj = new Program02(21 , "suji");
		
		void display()
		{
			System.out.println(obj.id);
			System.out.println(obj.name);	
		}
		
		public InnerSample()
		{
			System.out.println("Object is created...");
		}
		
		static void option()
		{
			System.out.println("static to static");
		}
		
	}
	
	//------------------Non-Static inner class----------------
	class SampleInner
	{
		int y = 32;
		
		void display()
		{
			System.out.println("y = "+y);
		}
		
		static void option()
		{
			Program02 outer = new Program02();
			System.out.println("x = "+outer.x);
		}
		
	}
	
	//------------------Local inner class----------------
	void localInnerClass()
	{
		class Sample
		{
			private int num;
			
			public Sample()
			{
				System.out.println("object created...");
				System.out.println(num);
			}
			static void add()
			{
				System.out.println("local inner class...");
			}
			
		}
		Sample obj =new Sample();
		obj.add();
		
	}
	
	//------------------Anonymous inner class----------------
	
		void mul()
		{
			System.out.println("Anonymous inner class");
			
		}
	


	public static void main(String[] args) 
	{
		//------------------Static inner class----------------

		Program02.InnerSample pis = new InnerSample();
		pis.display();
		
		Program02.InnerSample.option();
		
		//------------------Non-Static inner class----------------

		Program02 outer = new Program02();
		Program02.SampleInner obj = outer.new SampleInner();
		obj.display();
	
		Program02.SampleInner.option();
		
		//------------------Local inner class----------------

		Program02 lic = new Program02();
		lic.localInnerClass();
		
		//------------------Anonymous inner class----------------

		Program02 aic = new Program02(){
			
			int x = 80;
			@Override
			void mul()
			{
				System.out.println("Child class anonymous created...");
			}
				};
		 aic.mul();
				
		 AnonmyInner ob = new AnonmyInner() {

			@Override
			public void sub() {
				System.out.println("Interface Anonymous created...");
				
			}
			 
		 };	
		 ob.sub();
		 
		 InnerAnonmy aci = new InnerAnonmy() {

			@Override
			void div() {
				System.out.println("abstract Anonymous created...");
			}
			 
		 };
		 aci.div();



	}

}

interface AnonmyInner
{
	void sub();
	}

abstract class InnerAnonmy
{
abstract void div();	
}







