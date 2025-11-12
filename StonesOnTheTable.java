import java.util.*;


public class StonesOnTheTable {

    public static int Solution(String stones){
        int count = 0;
        for(int i = 0; i < stones.length() - 1; i++){
            if (stones.charAt(i) == stones.charAt(i+1)) count++;
            
        }

        return count;
    }




    

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        String stones = sc.next();
        System.out.println(Solution(stones));

    }

    
    
}
