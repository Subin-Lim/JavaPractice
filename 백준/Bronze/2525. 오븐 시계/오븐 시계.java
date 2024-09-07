import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H,M,C;
		H = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();
        
        M+=C;
        H+=M/60;
        M=M%60;
        
        H = H%24;
        System.out.println(H+" "+M);
        
	}
}