import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    for(int i=1;i<=a;i++){
	        for(int j=1;j<=a;j++){
	            if(i==1||i==a||j==1||j==a||i==j||i==(a+1)-j){
	                System.out.print("*");
	            }else{
	                 System.out.print(" ");
	            }
	            
	        }
	             System.out.println();
	        
	        
	    }
	}
	
}
