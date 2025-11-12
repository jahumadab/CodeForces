import java.util.Scanner;

public class magnets {


    public static int groupsOfMagnets(int [] n){
        int count = 0;
        for ( int i = 0 ; i < n.length - 1; i++){
            if(n[i] != n[i+1]){
                count++;
            } 



        }
        count++;
        return count;
    }
    

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println(groupsOfMagnets(arr));

        
        
    }
}
