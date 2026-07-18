
import java.util.ArrayList;
import java.util.List;

abstract class Student {

    String name;
    int roll;
    double fee;
    int attendanceCount = 0;
    String course;
    String grade;
    String result;
    int marks;

    public Student(String name, int roll, double fee, String course, int marks) {
        this.name = name;
        this.roll = roll;
        this.fee = fee;
        this.course = course;
        this.marks = marks;
    }

    abstract void attendClass();

    abstract void giveExam();

    abstract void payFee(double toPay);

    void calculateGrade() {
        if (marks > 90) {
            grade = "A+";
        } else if (marks > 80) {
            grade = "A";
        } else if (marks > 70) {
            grade = "B+";
        } else if (marks > 60) {
            grade = "B";
        } else if (marks > 50) {
            grade = "C+";
        } else if (marks > 40) {
            grade = "C";
        } else {
            grade = "NG";
        }
        result = (grade.equals("NG")) ? "FAIL" : "PASS";
    }

    ;
    void showAttendance() {
        System.out.println("Total attendance: " + attendanceCount);
    }
;

}

interface LibraryHelper {

    List<String> borrowedBooks = new ArrayList<>();

    void borrowBook(String bookName);

    void checkBorrowed();

    void showList();
}

class StudentCEIV extends Student implements LibraryHelper {

    public StudentCEIV(String name, int roll, double fee, String course, int marks) {
        super(name, roll, fee, course, marks);
    }

    @Override
    void attendClass() {
        System.out.println(name + " attended class!");
        attendanceCount++;
    }

    @Override
    void giveExam() {
        System.out.println(name + " is giving exam.");
    }

    @Override
    void payFee(double toPay) {
        if (fee != toPay) {
            System.out.println("Please pay fee in full amount. \nTotal to pay: " + fee);
            return;
        }
        fee = 0;
    }

    @Override
    public void checkBorrowed() {
        System.out.println(borrowedBooks.isEmpty() ? "No books borrowed!" : "Books borrowed!");
    }

    @Override
    public void showList() {
        for (String s : borrowedBooks) {
            System.out.println(s);
        }
    }

    @Override
    public void borrowBook(String bookName) {
        borrowedBooks.add(bookName);
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }

    public void getMarks() {
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        StudentCEIV s = new StudentCEIV("Ayush", 7, 34000, "Java", 95);
        s.attendClass();
        s.giveExam();
        s.payFee(500);
        s.calculateGrade();
        s.showAttendance();
        s.showInfo();
        s.getMarks();
        s.checkBorrowed();
        s.borrowBook("Advanced Programming in Java");
        s.checkBorrowed();
        s.showList();
    }
}
