# Object-Oriented Programming in Java
Object-Oriented Programming (OOP) is a programming paradigm that relies on the concept of objects, which are instances of classes. It organizes software design around data (attributes) and methods (functions) that operate on the data, rather than purely functions and logic. OOP allows for more modular, reusable, and maintainable code.<br>

Java, as an OOP language, follows the four fundamental principles of Object-Oriented Programming:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

## OOP Principles in Java
### 1. Encapsulation
Encapsulation is the process of bundling data (variables) and methods that operate on the data into a single unit or class. It also involves restricting access to some of an object’s components using access modifiers like `private`, `protected`, and `public`.
```java
public class Car {
     private String color;
     private int speed;

     // Constructor to initialize the car
     public Car(String color) {
          this.color = color;
          this.speed = 0;  // Default speed is 0
     }

     // Getter and Setter methods (Encapsulated Access)
     public String getColor() {
          return color;
     }

     public void accelerate(int increment) {
          speed += increment;
     }

     public void brake(int decrement) {
          speed -= decrement;
          if (speed < 0) {
               speed = 0;
          }
     }
}

```
### 2. Inheritance
Inheritance is a mechanism where one class (child class) inherits properties and behaviors (fields and methods) from another class (parent class). This promotes code reuse and establishes a natural hierarchy.
```java
public class Animal {
     String name;
     int age;

     public void makeSound() {
          System.out.println("Some sound");
     }
}

public class Dog extends Animal {
     @Override
     public void makeSound() {
          System.out.println("Woof!");
     }
}

```
* The Dog class inherits the properties `name` and `age` from the Animal class and overrides the `makeSound()` method to provide its own implementation.
### 3. Polymorphism
Polymorphism allows one entity (like a method or object) to take many forms. In Java, polymorphism can be achieved via method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).
```java
public class Animal {
     public void makeSound() {
          System.out.println("Some sound");
     }
}

public class Dog extends Animal {
     @Override
     public void makeSound() {
          System.out.println("Woof!");
     }
}

public class Test {
     public static void main(String[] args) {
          Animal animal = new Dog();
          animal.makeSound();  // Output: Woof!
     }
}

```
* Runtime Polymorphism is demonstrated here, where the `makeSound()` method is determined at runtime based on the actual object type (`Dog`), even though the reference type is `Animal`.
### 4. Abstraction
Abstraction is the concept of hiding the implementation details and showing only the essential features of an object. In Java, abstraction is achieved using abstract classes and interfaces.
```java
abstract class Animal {
     String name;
     abstract void makeSound();  // Abstract method without implementation
}

class Cat extends Animal {
     @Override
     void makeSound() {
          System.out.println("Meow!");
     }
}
```
* Abstract Class provides a template for the subclass. The subclass (`Cat`) must implement the abstract method `makeSound()`.

## Practical Examples
### Car Example (Encapsulation & Object Instantiation)
```java
public class Car {
     private String color;
     private String brand;
     private int speed;

     // Constructor
     public Car(String color, String brand) {
          this.color = color;
          this.brand = brand;
          this.speed = 0;
     }

     public void accelerate(int increment) {
          speed += increment;
     }

     public void brake(int decrement) {
          speed -= decrement;
          if (speed < 0) speed = 0;
     }

     public String getCarInfo() {
          return "Car: " + color + " " + brand + " | Speed: " + speed;
     }

     public static void main(String[] args) {
          Car myCar = new Car("Blue", "Tata");
          myCar.accelerate(10);
          System.out.println(myCar.getCarInfo());  // Output: Car: Blue Tata | Speed: 10
     }
}

```
### Animal Example (Inheritance & Polymorphism)
```java
public class Animal {
     String name;
     int age;

     public void makeSound() {
          System.out.println("Some Sound");
     }
}

public class Cat extends Animal {
     @Override
     public void makeSound() {
          System.out.println("Meow!");
     }
}

public class Dog extends Animal {
     @Override
     public void makeSound() {
          System.out.println("Woof!");
     }
}

public class Test {
     public static void main(String[] args) {
          Animal myDog = new Dog();
          myDog.makeSound();  // Output: Woof!

          Animal myCat = new Cat();
          myCat.makeSound();  // Output: Meow!
     }
}

```
### Advantages of OOP in Java
1. **Modularity:** Each object is independent and responsible for its own data and behavior.
2. **Code Reuse:** Inheritance allows new classes to reuse code from existing classes.
3. **Flexibility:** Polymorphism allows for one interface to be used for a general class of actions.
4. **Security:** Encapsulation hides the internal state of objects from outside modification, allowing controlled access via methods.
   
### Key OOP Terms
* **Class:** A blueprint or template for creating objects.
* **Object:** An instance of a class.
* **Method:** A function defined in a class that operates on its data.
* **Constructor:** A special method used to initialize an object when it is created.
* **Abstract Class:** A class that cannot be instantiated on its own and provides a blueprint for other classes.
* **Interface:** A reference type that contains only constants, method signatures, and nested types.
* **Overloading:** Defining multiple methods with the same name but different parameters.
* **Overriding:** Redefining a method in a subclass that is already defined in its superclass.
