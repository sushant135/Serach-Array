import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class SearchArray {
    private static int i;

    public static void main(String [] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("enter number of element you want in array: ");
     int a =sc.nextInt();
     int[] n=new int[a];
     System.out.println("Enter element of array: ");
     for(int i=0; i<a; i++){
    n[i]=sc.nextInt();
    
     }
     System.out.print("enter number you want to find: ");
     int x=sc.nextInt();
     for(int i=0; i<a;i++){
        if(n[i]==x){
        System.out.println(i);
     }  
     
    }
    }
}
