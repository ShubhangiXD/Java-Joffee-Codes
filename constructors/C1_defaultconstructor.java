package constructors;

public class C1_defaultconstructor {
    C1_defaultconstructor() {
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println("Just a display function :)");
    }

    public static void main(String[] args) {
        C1_defaultconstructor obj = new C1_defaultconstructor();
        obj.display();
    }
}
