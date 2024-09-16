import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int[] num= new int[6];
        int[] check= {1, 1, 2, 2, 2, 8};
        
        for(int i = 0; i<6; i++){
            num[i]= sc.nextInt();
        }
        
        for(int j = 0; j<6; j++){
            System.out.print((check[j]-num[j])+" ");
        }
        
        
	}
}