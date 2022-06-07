import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, i = 0, firstValue = 0, secondValue = 1, next;
        sc = new Scanner(System.in);
        System.out.println("Lutfen hesaplamak istediginiz seri sayisini girin: ");
        number = sc.nextInt();
        while (i <= number) {
            if (i <= 1) {
                next = i;
            } else {
                next = firstValue + secondValue;
                System.out.println(firstValue + " + " + secondValue + " = " + next);
                firstValue = secondValue;
                secondValue = next;
            }
            i++;
        }
    }
}
