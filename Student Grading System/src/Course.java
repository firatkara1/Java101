public class Course {
    Teacher teacher;//siniflar birbirlerinin nitelikleri olabilir.

    String name;
    String code;
    String prefix;
    int note;
    int verbNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbNote = 0;
    }



    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacherInfo();
        }else{
            System.out.println("Hata! Ders ve ogretmen bransi eslesmiyor..");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}




