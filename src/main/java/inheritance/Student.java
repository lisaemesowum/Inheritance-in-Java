package inheritance;

public class Student extends Person {
    char Grade;
    int rollback;   //unique identifier for a student within a class or school.
     // create a constructor connecting from the parent

    public Student(String name, int age, String address, String gender , char Grade, int rollback) {
        super(name, age, address, Gender.valueOf(gender));
        this.Grade = Grade;
        this.rollback = rollback;
    }
    public String  displayStudentInfo(){
        return super.displayInfo() + "\nGrades: " + Grade + "\n rollbacks: " + rollback;
    }
}
