package inheritance;
//hierarchical inheritance
class I2_Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends I2_Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends I2_Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark();//C.T.Error
    }
}
