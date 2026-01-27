package Enumeration;

public enum EnumStructure 
{
	CONTINUE(100),
	PAGE_NOT_FOUND(404),
	INTERNAL_SERVER_ERROR(500);

	int statusCode;
	EnumStructure(int statusCode) 
	{
		this.statusCode = statusCode;
	}
	
	public int getStatusCode()
	{
		return statusCode;
		
	}
}

