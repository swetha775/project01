package objectClass;

import java.lang.reflect.Method;

public class Program01 implements Cloneable
{
	
	int id;
	String name;
	
	public Program01(	int id , String name)
	{
		this.id = id;
		this.name = name;	
	}
	
	@Override
	public int hashCode()
	{
		return 0;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Program01 obj1 = null;
		boolean result = false;
		if(obj instanceof Program01)
		{
			obj1 = (Program01) obj;
			if(this.name == obj1.name && this.id == obj1.id)
			{
				result = true;
			}
		}
		return result;
	}
	
	/*@Override
	public String toString()
	{
		//return this.id+"-"+this.name;
		Class<?> clazz = super.getClass();
		String className = clazz.getName();
		int num = super.hashCode();
		String hexnumber = Integer.toHexString(num);
		return className +"@" +hexnumber;
	}*/

	@Override
	protected void finalize()
	{
		System.out.println("The object destroyed...");
	}
	
	@Override
	public String toString()
	{
		return "Program01 {"+"id :"+id+"name :"+name+"}";
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		//return super.clone();
		return this;
		
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Program01 obj = new Program01(101 , "swe");
		Program01 obj1 = new Program01(102 , "swe");
		
		Class<?> claz = obj.getClass();
		System.out.println(obj.getClass());   //we cannot override the methods      
		
		Method methods[] = claz.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName());
			//System.out.println(method.getModifiers());			
		}
		System.out.println(obj.hashCode());      //we can override the methods
		
		System.out.println(obj == obj1 );        //It check only memory location -> False
		
		System.out.println(obj.equals(obj1));
		
		//System.out.println(obj);

		obj = null;
		System.gc();
		
		Program01 copy = (Program01) obj1.clone();
		obj1.id =200;             //deep copy
		System.out.println(obj1);
		System.out.println(copy);
		
	}

}
