import java.util.*;
class P{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	long n = sc.nextLong();
	long i=n;
	    int j;
	System.out.print(n+":");
	while(i!=1){
	    for(j = 2 ; j < n ; j++){
		if(i%j==0){
		    System.out.print(" "+j);
		    i=i/j;
		    break;
		}
	    } 
	}
	System.out.println();
    }
}
