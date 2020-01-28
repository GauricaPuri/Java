class greatest
{
	public static void main( String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a > b && a > c)
        	{
            		System.out.println("Largest number is:"+a);
        	}
        	else if(b > c)
        	{
            		System.out.println("Largest number is:"+b);
        	}
        	else
        	{
            		System.out.println("Largest number is:"+c);
        	}	
		
	}
}