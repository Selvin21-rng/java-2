CONCODENATE 
public class Main
{
	public static void main(String[] args) {
	    String str1="hello";
	    String str2="world";
		System.out.println("print statement:" +str1+" " +str2);
	}
}



LENGTH METHOD

public class Main
{
	public static void main(String[] args) {
	    String str="hello";
	    int length=str.length();
		System.out.println("print statement:" +length);
	}
}


CHAR METHOD

public class Main
{
	public static void main(String[] args) {
	    String str="hello";
	    //String sr2="world";
	    char ch=str.charAt(3);
		System.out.println("print statement:" +ch);
	}
}



BOOLEAN

public class Main
{
	public static void main(String[] args) {
	    String str1="hello";
	    String str2="world";
	    
		System.out.println("Check wheather it is equal :"+ str1.equals(str2));
	}
}


IGNORE CASE


public class Main
{
	public static void main(String[] args) {
	    String str1="hello";
	    String str2="hello";
	    
		System.out.println("Check wheather it is equal :"+ str1.equalsIgnoreCase(str2));
	}
}



UPPER LOWER CASE

public class Main
{
	public static void main(String[] args) {
	    String str1="hello";
	   // String str2="hello";
	    
		System.out.println("UpperCase :"+ str1.toUpperCase());
		System.out.println("UpperCase :"+ str1.toLowerCase());
	}
}


INDEX

public class Main
{
	public static void main(String[] args) {
	    String str1="hello";
	   // String str2="hello";
	    
		System.out.println("IndexOf :"+ str1.indexOf('R'));
		
	}
}




LAST INDEX

public class Main
{
	public static void main(String[] args) {
	    String str1="hello";
	   // String str2="hello";
	    
		System.out.println("LastindexOf :"+ str1.lastIndexOf('0'));
		
	}
}


STARTWITH AND ENDSWITH

public class Main
{
	public static void main(String[] args) {
	    String str1="HELLO MY FRIENDS";
	   // String str2="hello";
	    
		System.out.println("StartsWith:"+ str1.startsWith("HELLO"));
			System.out.println("StartsWith:"+ str1.endsWith("FRIENDS"));
		
		
	}
}






REPLACE

public class Main
{
	public static void main(String[] args) {
	    String str1="hello";
	   String str2="world";
	    
		System.out.println("Replace:"+ str1.replace('o','e'));
			
		
		
	}
}


ISEMPTY

public class Main
{
	public static void main(String[] args) {
	    String str1=" ";
	   String str2="world";
	    
		System.out.println("print statement:"+ str1.isEmpty());
			
		
		
	}
}


 REVERSED

public class Main
{
	public static void main(String[] args) {
	    String str="hello";
	   String reversed="";
	   
	   for(int i=str.length()-1;i>=0;i--){
	       
	       reversed+=str.charAt(i);
	       
	       
	   }
	    
		System.out.println("print the values :  "  +reversed);
			
		
		
	}
}



 FIND LETTER IN NAME

public class Main
{
	public static void main(String[] args) {
	    String str="SELVIN";
	   char ch='E';
	   int count=0;
	   
	   for(int i=0;i<str.length();i++){
	       
	       if(str.charAt(i)==ch)
	       {
	       
	 count ++;
}

}
System.out.println(count);
}
}


