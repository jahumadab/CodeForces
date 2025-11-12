import java.util.Scanner;


public  class word{

    public static String extension(String s){
        int count_lower = 0;
        int count_upper = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >='a' && s.charAt(i) <='z'){
                count_lower++;  
            }
            else if(s.charAt(i) >='A' && s.charAt(i) <='Z'){
                count_upper++;
            }
        }

        if(count_lower >= count_upper){
            return s.toLowerCase();
        }
        else{
            return s.toUpperCase();
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(extension(s));
        sc.close();

        


    }
}