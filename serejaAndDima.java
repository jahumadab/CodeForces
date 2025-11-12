import java.util.*;

public class serejaAndDima {

    public static int [] Solution(LinkedList<Integer> arr){
        int p1 = 0;
        int p2 = 0;
        boolean  flag = true;

        while(!arr.isEmpty()){

            if(flag){
                if(arr.getFirst() > arr.getLast()){
                    p1+=arr.getFirst(); 
                    arr.removeFirst();
                    flag = false;
                }
                else{
                    p1+=arr.getLast(); 
                    arr.removeLast();
                    flag = false;

                } 

            }
            else{
                if(arr.getFirst() > arr.getLast()){
                    p2+=arr.getFirst(); 
                    arr.removeFirst();
                    flag = true;
                }
                else{
                    p2+=arr.getLast(); 
                    arr.removeLast();
                    flag = true;

                } 

            }

            



            }


        


        int arr2 [] = new int[2];
        arr2[0] = p1;
        arr2[1] = p2;
        return arr2;
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            arr.add(sc.nextInt());
        }
        int[] res = Solution(arr);
        System.out.println(res[0] + " " + res[1]);
    }
}
