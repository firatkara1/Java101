public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String studentNumber;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String studentNumber, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.c1 = c1;
        this.c2=c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int verbNote1, int verbNote2, int verbNote3  ){
        if ((note1 >= 0 && note1 <= 100) && (verbNote1 >= 0 && verbNote1 <= 100)){
            this.c1.note = note1;
        }
        if ((note2 >= 0 && note2 <= 100) && (verbNote2 >= 0 && verbNote2 <= 100)){
            this.c2.note = note2;
        }
        if ((note3 >= 0 && note3 <= 100) && (verbNote3 >= 0 && verbNote3 <= 100)){
            this.c3.note = note3;
        }
    }

    void printNote(){
        System.out.println(this.name + " isimli ogrenci icin sonuclar");
        System.out.println(c1.name + " dersi notu: " + c1.note );
        System.out.println(c2.name + " dersi notu: " + c2.note);
        System.out.println(c3.name + " dersi notu: " + c3.note);
    }

    public void calcAverage(){
        double res1 = (this.c1.note * 0.8 + this.c1.verbNote * 0.2);
        double res2 = (this.c2.note * 0.7 + this.c2.verbNote * 0.3);
        double res3 = (this.c3.note * 0.8 + this.c3.verbNote * 0.2);
        this.average = (res1 + res2 + res3) / 3.0;
    }

    void  isPass(){
        printNote();
        calcAverage();

        if (this.average>55){
            System.out.println("Ortalamasi: " + this.average);
            System.out.println("Tebrikler Sinifi Gectiniz.");
            this.isPass = true;
        } else{
            System.out.println("Ortalamasi: " + average);
            System.out.println("Sinifi gecemediniz!");
            this.isPass = false;

        }
    }
}
