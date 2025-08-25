package inheritance;

public class Teacher extends Person {
    String subject;
    double salary;

    // constructor
    public Teacher(String name, int age, String address, String gender , String subject, double salary){
        super(name, age, address, Gender.valueOf(gender));
        this.subject = subject;
        this.salary = salary;
    }
    public String displayTeacherInfo(){
        return super.displayInfo() + "\nSubjects: " + subject + "\nTeachers Salary: " +salary;
    }
    public double calculateSalary(double bonus){
        return salary + bonus;

    }
}
