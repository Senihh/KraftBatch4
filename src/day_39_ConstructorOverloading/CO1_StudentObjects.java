package day_39_ConstructorOverloading;

public class CO1_StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("Mehmet",25,'m',95,1234);
        System.out.println("student1.name = " + student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);
        System.out.println(student1.grade);
        student1.name="Osman";
        System.out.println(student1);
    }

}
