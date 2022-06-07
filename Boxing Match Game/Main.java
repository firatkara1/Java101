
public class Main {


    public static void main(String[] args) {

        Fighter f1 = new Fighter("A", 10, 100, 90,30,2);
        Fighter f2 = new Fighter("B", 10, 100, 85,40,95);

        Match match = new Match(f1,f2,80,95);
        match.run();

    }

}
