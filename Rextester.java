import java.util.*;
import java.lang.*;

class Rextester


{

     public static void main(String []args)
     {
         int arr[]={1,2,3,4,5,6,7,8,9,10};
         int k;
         int size=arr.length;
         int flag=0;
         Scanner sc= new Scanner(System.in);
         k=sc.nextInt();
         
         for(int i=0;i<=size;i++)
         {
         if(arr[i]==k)
         {
            flag++; 
         } 
         }
         if(flag==0)
         {
            System.out.println("no");
             
         }
         else
         {
            System.out.println("yes"); 
         }
     
     
     }
}
