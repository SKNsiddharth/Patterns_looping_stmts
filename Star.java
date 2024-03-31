class Star
{
	public static void main(String[] args)
	{
		P1();
		P2();
        
    }
	
	public static void P1()
		{
			for(int i=1;i<=4;i++)
			{
           
            for(int j=1;j<=i;j++)
            
            {
                
                System.out.print("* ");
               
            }
            System.out.println();
            
			}
		}
	
    public static void P2() 
		{
        
        for(int i=1;i<=4;i++)
        {
           
            for(int j=1;j<=i;j++)
            
            {
                
                System.out.print("* ");
               
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        System.out.print("* ");
        System.out.println();   
            for(int i=1;i<=4;i++)
        {
           
            for(int j=4;j>=i;j--)
            
            {
                
                System.out.print("* ");
               
            }
            System.out.println();
            
        }
   }
}

	
