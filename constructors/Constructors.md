## Constructors:
Constructors are special methods that are used to initialize objects when they are created. They have the same name as the class they belong to and are syntactically similar to methods, but they do not have an explicit return type. <br>
```
public class MyClass {
  public MyClass() {} // Default constructor

  // Constructor with parameters
  public MyClass(int x, String y) {
    this.x = x;
    this.y = y;
  }

  // ...
}
```
To make a new object, you need to use the "new" keyword: <br>
```
MyClass myObject = new MyClass(); // Creates a new object of the MyClass class using the default constructor

MyClass myOtherObject = new MyClass(10, "Hello!"); // Creates a new object of the MyClass class using the constructor with parameters
```
Constructors can be used to initialize instance variables: <br>
```
public class Person {
  private String name;
  private int age;

  public Person() {}

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // ...
}
```
Default constructor: <br>
If you do not define any constructors for a class, the Java compiler will automatically create a default constructor for you. The default constructor has no parameters and does nothing but initialize all instance variables to their default values. <br> <br>
Parameterised constructor: <br>
You can choose to pass arguments to be used in the constructors and use the "this" keyword to refer to that instance of the variable in a parameterised constructor. Parameterised constructors have to be user defined. <br>

```
// Creating a new object of the MyClass class using the default constructor
MyClass myObject = new MyClass();

// Creating a new object of the MyClass class using the constructor with parameters
MyClass myOtherObject = new MyClass(10, "Hello!");

// Creating a new object of the Person class using the constructor with parameters
Person person = new Person("John Doe", 30);
```
