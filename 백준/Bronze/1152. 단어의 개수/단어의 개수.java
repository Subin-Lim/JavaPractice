import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        if(S.trim().isEmpty()){
            System.out.println(0);
        }else{
            String[] word= S.trim().split(" ");
            System.out.println(word.length);
        }
        
        sc.close(); 
    }
}
