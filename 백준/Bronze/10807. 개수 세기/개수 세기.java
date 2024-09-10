import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
        int[] num= new int[a];
        int count = 0;
        
        for(int i = 0; i<a; i++){
            num[i]= sc.nextInt();
        }
        c = sc.nextInt();
        for(int i = 0; i<num.length; i++){
            if(num[i] == c){
                count++;
            }
        }
        System.out.println(count);
        
	}
}