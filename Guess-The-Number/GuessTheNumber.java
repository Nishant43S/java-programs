import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snum = (int) (Math.random() * 100) + 1;
        int count = 0;
        while (true){
            System.out.print("Enter Number:");
            int num = sc.nextInt();
            count = count+1;
            if (num > snum){
                System.out.println("number is small");
            }else if(num<snum){
                System.out.println("Number is greater");
            }else{
                System.out.println("you got the number in "+count+" chances");
                break;
            }
        }
        
    }
}