public class Main
{
	public static void main(String[] args) {
	    int a[]={23,12,45,67,87};
	    for(int i=0;i<a.length;i++){
	        
	    }
	 System.out.println();   
	int max=a[0];
	int min=a[0];
	 for(int i=0;i<a.length;i++){
	     if(max<a[i]){
	         max=a[i];
	     }
	  if(min>a[i]){
	         min=a[i];   
	}
}
System.out.println(max);
System.out.println(min);
}
}