import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		for(int i=1;i<n;i++){
		    if(n%i==0){
		        if(prime(i)){
		            System.out.println(i);
		        }
		    }
		}
		
	}
	public static boolean prime(int n){
	    if(n<2){
	        return false;
	    }
	  
	        for(int i=2;i<=Math.sqrt(n);i++){
	            if(n%i==0){
	                return false;
	             
	 
	            }
	            
	        }
	        return true;
	        
	    }
	}
