import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n<2){
		    System.out.println("A prime number");
		}
		else{
		    for(int i=1;i<Math.sqrt(n);i++){
		        if(n%i==0){
		            System.out.println("not a prime number");
		            break;
		        }
		        System.out.println("prime number");
		    }
		    
		}
	
	}
