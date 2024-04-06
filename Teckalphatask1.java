class Teckalphatask1
{
	public static void main(String ar[])
	{ 
		int i,j;
		int x[]={1,2,2,3,3,4,5};
		
		int s=0;
		for(i=0;i<x.length;i++)
		{
			int d=x[i];
			if(s!=d)
			{
				for(j=0;j<x.length;j++)
				{
					if(d==x[j])
					{
						s=x[j];
					}
				}
				System.out.print(s+" ");
			}
		}
    }
}
			