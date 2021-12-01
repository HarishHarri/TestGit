package companycode;
import java.util.Scanner;
class solution{
	public void solution(int N)
	{
		int k,i,j,n=N;
        int sc,hc;
        sc=1;
        hc=n-1;
        for(k=0;k<n;k++)
        {
            if(k%2==0)
            {
                for(i=1;i<=sc;i++)
                {
                    System.out.print("*");
                }
                for(j=1;j<=hc;j++)
                {
                 System.out.print("#");
                }
            }
            else
            { 
                for(i=1;i<=hc;i++)
                {
                    System.out.print("#");
                }
                for(j=1;j<=sc;j++)
                {
                 System.out.print("*");
                }
            }
             System.out.print("\n");
             if(k<n/2)
             {
            sc++;
            hc--;
             }
             else
            {
            sc--;
            hc++;
             }
        }
	}
}
class Main{
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int N=sc.nextInt();
	        solution s = new solution();
	        s.solution(N);
	    }
	}
