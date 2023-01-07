package OOPS;

class Car{
    int wheels;
    String color;
    int speed = 0;

    public void increaseSpeed(){
        speed += 10;
        System.out.println("Speed increased to " + speed);
    }

    public void decreaseSpeed(){
        speed -= 10;
        System.out.println("Speed decreased to " + speed);
    }
}

class Person{
    String name;
    int age;

    Person(){
        System.out.println("Creating object");
    }

    void walk(){
        System.out.println(name + "is walking");
    }

    void eat(){
        System.out.println(name + "is eating");
    }

    void walk(int steps){
        System.out.println(name  + "walked " + steps +" steps");
    }
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.speed = 50;
//        car1.color = "black";
//        car1.wheels = 4;
//        car1.increaseSpeed();
//        car1.decreaseSpeed();

        Person p1 = new Person();
        p1.age = 22;
        p1.name = "Priyanshu Paliwal";
        p1.walk();
        p1.walk(25);

        // System.out.println(p1.age + " " + p1.name);

        Person p2 = new Person();
        p2.age = 28;
        p2.name = "HElo";
        p2.eat();

//        System.out.println(p2.age + " " + p2.name);
    }
}
