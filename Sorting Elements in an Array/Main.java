
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;
        int listLen;

        System.out.println("Dizinin boyutunu giriniz :");
        listLen = sc.nextInt();

        int [] list = new int[listLen];

        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i = 0; i < listLen; i++)
        {
            System.out.print((i+1) + ". elemanını : ");
            list[i] = sc.nextInt();
        }

        for(int i = 0; i < listLen; i++)
        {
            for(int j = i+1; j < listLen; j++)
            {
                if(list[j] < list[i]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.print("Sıralama : ");
        for(int i = 0; i < listLen; i++)
        {
            System.out.print(" " + list[i]);
        }

    }
}
