package constructors;
import java.util.*;

public class C3_classstudents {
    int rollno;
    String name;

    C3_classstudents(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        C3_classstudents[] arr = new C3_classstudents[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the roll number: ");
            int rollno = sc.nextInt();
            System.out.println("Enter the name: ");
            String name = sc.next();
            arr[i] = new C3_classstudents(rollno, name);
        }
        
        System.out.println("Student details: ");
        for (C3_classstudents s : arr) {
            s.display();
        }
        sc.close();
    }
}
