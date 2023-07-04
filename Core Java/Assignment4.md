# Q1 :
**Answer** :
```java
public class MyClass {
    public static void main(String args[]) {
      Car audi = new Car();
      audi.start();
      audi.drive();
    }
}
interface Vehicle{
        void start();
        void drive();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("the car is started");
    }
    public void drive(){
        System.out.println("Started Driving the car");
    }
}
```

# Q2 :
Answer :- 
```java
public class MyClass {
    public static void main(String args[]) {
      Car audi = new Car();
      audi.start();
      audi.drive();
      audi.refill(50);
      System.out.println(audi.CheckFuel());
    }
}
abstract class Vehicle{
    int fuel=0;
    abstract void start();
    abstract void drive();
    int CheckFuel(){
        return fuel;
    }
    void refill(int fuel){
        this.fuel=fuel;
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("the car is started");
    }
    public void drive(){
        System.out.println("Started Driving the car");
    }
}
```

# Q3 : 
Answer : 
The Interface which has only 1 method is called Functional Interface
```java
public class MyClas{
    public static void main(String args[]){
        Calc c= new Calc();
        System.out.println(c.addNumbers(5,10));
    }
}
interface Sum{
    int addNumbers(int a,int b);
}
class Calc implements Sum{
    public int addNumbers(int a , int b){
        return a+b;}
}
```

# Q4 : 
Answer : An Iterface is just like a abstract class. it is used to achieve abtsraction. in abstract class we use the extends method but in interface we use the implements keyword. If a interface is extending a interface we have to use extends keyword.

# Q5 :
Answer : 
An Interface in Java is used to achieve the 100% abtstraction. in abstarction we can create concrete or abstract method but in interface we simply can make only abstract method. In Java 8 default , static methods were added which can be used to create non abstract method.

# Q6 :
Answer :- Lambda Expressions are used to remove the extra code and by the help of lambda expression we can easily create a method.
Lambda expressions are only used for the Functional Interface
It is also called anonymous method. Returns mainly functions

> Syntax 
> No parameters:- () ->{}
> With Parameters : (a)->{}


# Q7 :
Answer : Yes Lambda expression can be passed to a function.
Lambda Expressions Can be used At many Places like:-
1. Where ever functional Interfaces are required
1. In Stream 

# Q8 : 
Answer : Functional Interface in Java is the interface which has only 1 method.

# Q9 :
Answer : The Lambda Expression Simplies the process of writing code to perform certain action if that code is required only once.

# Q10 :
Answer : No it is not mandatory to have parameters inside a lambda expression