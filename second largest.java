import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter num");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    
	    int temp;
	    System.out.println("enter the elements");
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        
	    }
	   for(int i=0;i<n;i++){
	      for(int j=i+1;j<a.length;j++){
	          if(a[i]>a[j]){
	              temp=a[i];
	              a[i]=a[j];
	              
	              a[j]=temp;
	              
	              
	              
	          }
	      }
	   }
	   System.out.println("sec largest num" +a[n-2]);
	}
}