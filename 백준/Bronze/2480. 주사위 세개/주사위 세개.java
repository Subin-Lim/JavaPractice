import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H,M,C;
        int money = 0;
		H = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();
        
        if(H==M&&M==C){
            money = 10000+H*1000;
        }else if(H==M||H==C){
            money = 1000+H*100;
        }else if(M==C){
            money = 1000+M*100;
        }
        else{
            if(H > M && H > C){
                money = H*100;
            }else if(M > H && M > C){
                money = M*100;
            }else{
                money = C*100;
            }
            
        }
        System.out.println(money);
        
	}
}