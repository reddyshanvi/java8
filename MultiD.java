package com.eshanvi.Assignments;

public class MultiD
{
	public static void main(String[] args)
	{
		int MultiD[][]=new int[2][3];
		int i,j,k=0;
		for(i=0;i<2;i++)
			for(j=0;j<3;j++)
			{
				MultiD[i][j]=k;
				k++;
			}
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(MultiD[i][j]+" ");
			System.out.println();
				
		}

	}

}
