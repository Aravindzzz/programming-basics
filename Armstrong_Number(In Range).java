import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<n;i++){
		    if(armstrong(i)){
		        System.out.println(i);
		    }
		}
		
	}
	public static boolean armstrong(int n){
	    int original = n;
	    int sum=0;
	    while(n>0){
	        int rem = n%10;
	        sum +=(int)Math.pow(rem,3);
	        n/=10;
	    }
	    return sum==original;
	}
}
