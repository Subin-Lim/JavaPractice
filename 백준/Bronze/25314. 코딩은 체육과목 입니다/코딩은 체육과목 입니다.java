import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N;
        String a = "";
        N = sc.nextInt();

        if(N%4 == 0){
            int count = N/4;
            for(int i = 1; i<=count; i++){
                a += "long ";
            }
            a+= "int";
        }
        System.out.println(a);
        
        
	}
}