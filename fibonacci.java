class fibonacci
{
	public static void main( String args[])
	{
		int n =Integer.parseInt(args[0]);
		int t1 = 0, t2 = 1;
        	System.out.println("First " + n + " terms: ");
        	for (int i = 1; i <= n; ++i)
        	{
            		System.out.println(t1);
            		int sum = t1 + t2;
            		t1 = t2;
            		t2 = sum;
        	}
    	}
}