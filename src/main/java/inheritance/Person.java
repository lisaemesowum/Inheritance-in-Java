package inheritance;
//School Management System
//Why: Schools have different types of people and staff with shared attributes.
//    Base Class: Person → name, age, address
//
//    Derived Classes:
//
//    Student → grade, rollNumber
//
//    Teacher → subject, salary
//
//    Extra Practice: Add methods like calculateSalary() or displayReport()







public class Person {
//person is the parent

//    attribute
    String name;
    int age;
    String address;
    Gender gender;


//constructor

    public Person(String name, int age, String address, Gender gender){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String displayInfo(){
        return "Person { " + "Name: " + name + ", age: " +  age + ", address: " + address  + ",Gender: " + gender;
    }
}
