import java.util.Scanner;
public class prime{
    public static void main(String[] args){
         
        //int count=0;
        Scanner prm = new Scanner(System.in);
        System.out.println("enter a number");
         int  varib = prm.nextInt();
         System.out.println(varib);
         boolean flag = false;
         for (int i = 2; i <= varib/ 2; ++i) {
           // condition for nonprime number
           if (varib% i == 0) {
             flag = true;
             break;
           }
         }
     
         if (!flag)
           System.out.println(varib + " is a prime number.");
         else
           System.out.println(varib + " is not a prime number.");
       }
     }
            


