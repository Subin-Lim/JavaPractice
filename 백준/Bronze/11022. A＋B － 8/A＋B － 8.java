import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T, a, b;
        T = sc.nextInt();

        for(int i=1; i<=T; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            int sum = a + b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+sum);  
            
            
        }
        
        
	}
}