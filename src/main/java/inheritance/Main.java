package inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //insert student1
        Student stud1 = new Student("lisa", 12,"no2 amachi road", "FEMALE", 'A', 2);

//        create teacher
        Teacher teacher1 = new Teacher("john" , 30 , "rivers", "MALE", "IT", 30000 );

        //display the student info
        System.out.println("========================Student info ========================");
        System.out.println(stud1.displayStudentInfo());

        // Display Teacher info
        System.out.println("=============== Teacher Info==================");
        System.out.println(teacher1.displayTeacherInfo());

        // Calculate Teacher salary with bonus
        double bonus = 5000;
        System.out.println("Teacher salary with bonus: " + teacher1.calculateSalary(bonus));
    }
}
