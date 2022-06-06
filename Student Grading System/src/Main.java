
public class Main {


    public static void main(String[] args) {

        Teacher t1 = new Teacher("Firat", "0537", "MAT");
        Teacher t2 = new Teacher("Fatma", "0536", "EDB");
        Teacher t3 = new Teacher("Eda", "0535", "FZK");
        //t1.print();

        Course matematik = new Course( "Matematik", "MAT101", "MAT");
        Course edebiyat = new Course( "Edebiyat", "EDB101", "EDB");
        Course fizik = new Course( "Fizik", "FZK101", "FZK");

        matematik.addTeacher(t1);
        edebiyat.addTeacher(t2);
        fizik.addTeacher(t3);

        System.out.println("---------------------------------");

        Student s1 = new Student("Ayse", "47", "4", matematik, edebiyat, fizik);
        s1.addBulkExamNote(70,77,59, 40,44,99);
        s1.isPass();
        System.out.println("---------------------------------");

        Student s2 = new Student("Ahmet", "123", "4", matematik, edebiyat, fizik);
        s2.addBulkExamNote(10,48,29,44,55,43);
        s2.isPass();
        System.out.println("---------------------------------");

        Student s3 = new Student("Mehmet", "135", "4", matematik, edebiyat, fizik);
        s3.addBulkExamNote(100,68,99,100,99,88);
        s3.isPass();
        System.out.println("---------------------------------");
    }
}
