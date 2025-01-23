1.) SIMPLE INTERSEST
import java.util.*;
public class Main{
    float ans;
    void interest(float p,float n,float r)
    {
        
        {
            ans=(p*n*r)/100;
	 System.out.println(ans);
        }
        
    
    }
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	float p=sc.nextFloat();
	float n=sc.nextFloat();
	float r=sc.nextFloat();
	Main m=new Main();
	m.interest(p,n,r);
	
	}

    }




