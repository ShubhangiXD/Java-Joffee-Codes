package constructors;
public class C2_studentconstructor {
    int rollno;
    String name;

    C2_studentconstructor(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        //'this' keyword refers to the current values in a method/constructor (to eliminate confusion)
    }

    void display() {
        System.out.println(rollno + " " + name + " ");
    }

    public static void main(String[] args) {
        C2_studentconstructor s1 = new C2_studentconstructor(1, "Rakesh");
        C2_studentconstructor s2 = new C2_studentconstructor(2, "Mohini");
        s1.display();
        s2.display();
    }
}
