import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, number, sum = 0 ;
        sc = new Scanner(System.in);
        
        System.out.println("\n Lutfen kontrol etmek istediginiz sayiyi girin...: ");
      
        number = sc.nextInt();

        for(i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.format("\n% d mükemmel sayıdır.", number);
        }
        else {
            System.out.format("\n% d mükemmel sayı değildir.", number);
        }
    }

}
