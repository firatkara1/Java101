
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int total,input,min=0,max=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kac sayi gireceksiniz: ");
        total = sc.nextInt();

        for(int i = 1; i <= total; i++){
            System.out.print(i + ". Sayiyi giriniz: "  );
            input = sc.nextInt();

            if (i==1){
                max = input;
                min = input;
            }else{
                if (input > max){
                    max = input;
                } else if (input < min) {
                    min = input;
                }
            }
        }
        System.out.println("En buyuk sayi = " + max);
        System.out.println("En kucuk sayi = " + min);

    }

}
