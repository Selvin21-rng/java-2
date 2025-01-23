3.)reverse number


import java.util.*;
 public class Main{
     public static void main(String[]args){
     int rem;
     int ans=0;
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     while(a!=0){
     rem=a%10;
     ans=(ans*10)+rem;
     a=a/10;}
     System.out.println(ans);
 }
 }