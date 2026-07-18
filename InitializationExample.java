class Student{
    String name;
    int age;

    public Student(){
        name = "Unknown";
        age = 0;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student (Student s){
        name = s.name;
        age = s.age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class InitializationExample{
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("Ayush", 18);
        Student s2 = new Student(s1);
        s.display();
        s1.display();
        s2.display();
    }
}