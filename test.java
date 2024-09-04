import java.util.Scanner;
//public class test {

    /**
     * @param args
     */
    /**public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        char a1= sc.next().charAt(0);
        char array1[]=num.toCharArray();
        for (char i : array1){
            if( i== a1){
                int count=0;
                count=count+1;
                System.out.println(count);
            }
            
        }
    
    }
}**/


public class test {
    public static void main(String[] args){
        try (Scanner a = new Scanner(System.in)) {
            String num=a.nextLine();
            char a1= a.next().charAt(0);
            char array1[]=num.toCharArray();
            for (char i : array1){
                if( i== a1){
                    int count=0;
                    count=count+1;
                    System.out.println(count);
                }
   }
        }
}
}


    

