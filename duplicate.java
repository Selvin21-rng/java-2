import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter num");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int t[]=new int[n];
	    int temp;
	    System.out.println("enter the elements");
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        
	    }
	   for(int i=0;i<n;i++){
	      for(int j=i+1;j<a.length;j++){
	          if(a[i]!=a[j]){
	              t[j]=a[j];
	              
	              
	              
	          }
	      }
	   }
	   System.out.println("duplicate numbers");
	   for(int i=0;i<n;i++)
	   {
	       System.out.println(t[i]);
	       
	   }
	}
	 
	   }