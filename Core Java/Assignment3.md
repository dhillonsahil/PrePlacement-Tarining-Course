# Q1 
Answer :- 
```java
public class BankAccount {
    private String accountHolderName;
    private String bankAccountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String bankAccountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Account Number " + bankAccountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Account Number " + bankAccountNumber);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Example usage
        BankAccount account1 = new BankAccount("John Doe", "1234567890", 1000.0);
        System.out.println("Account Holder Name: " + account1.getAccountHolderName());
        System.out.println("Account Number: " + account1.getBankAccountNumber());
        System.out.println("Initial Balance: " + account1.getBalance());
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println("Updated Balance: " + account1.getBalance());

        BankAccount account2 = new BankAccount("Jane Smith", "0987654321", 2000.0);
        System.out.println("\nAccount Holder Name: " + account2.getAccountHolderName());
        System.out.println("Account Number: " + account2.getBankAccountNumber());
        System.out.println("Initial Balance: " + account2.getBalance());
        account2.deposit(1000.0);
        account2.withdraw(500.0);
        System.out.println("Updated Balance: " + account2.getBalance());
    }
}

```

# Q2 : 
Answer : 
```java
public class MyClass {
    public static void main(String args[]) {
        Animal anim=new Animal();
        animal.eat("Elephant");
     Dog tommy=new Dog();
     tommy.eat("tommy"); 
     tommy.sleep("tommy");
    }
}

class Animal{
    protected void eat(String name){  // Over ridden Method
        System.out.println(name + " is eating"); 
    }
    protected void sleep(String name){
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal{
    public void eat(String name){  // Over riding method
        System.out.println(name + " is eating And he is a dog");
    }
}
```
# Q3 : 
**Answer** :- RunTime Polymorphism in Java is used by method overriding.
The above same example shows us the run time polymorphism.
```java
public class MyClass {
    public static void main(String args[]) {
        Animal anim=new Animal();
        animal.eat("Elephant");
     Dog tommy=new Dog();
     tommy.eat("tommy"); 
     tommy.sleep("tommy");
    }
}

class Animal{
    protected void eat(String name){  // Over ridden Method
        System.out.println(name + " is eating"); 
    }
    protected void sleep(String name){
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal{
    public void eat(String name){  // Over riding method
        System.out.println(name + " is eating And he is a dog");
    }
}
```

# Q4 : 
**Answer** :- 
```java
public class MyClass {
    public static void main(String args[]) {
     Dog tommy=new Dog();
     tommy.eat("tommy","German"); 
     tommy.sleep("tommy");
    }
}

class Animal{
    protected void eat(String name){  // Over ridden Method
        System.out.println(name + " is eating"); 
    }
    protected void sleep(String name){
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal{
    public void eat(String name){  // Over riding method
        System.out.println(name + " is eating And he is a dog");
    }
    public void eat(String name,String breed){
        
        System.out.println(name + " is eating And he is a dog of "+breed);
    }
}
```

# Q5 : 
Answer :- 
```java
public class MyClass {
    public static void main(String args[]) {
      Square sq= new Square(5);
      System.out.println(sq.getSquare());
    }
}
interface Mathematics{
    int getSquare();
}
class Square implements Mathematics{
    int data;
    Square(int data){
        this.data=data;
    }
    public int getSquare(){
        return data*data;
    }
}
```

# Q6 
**Answer** :- Encapsulation in Java is used to hide the unrelevant details from the user and we can use it for contolled access. That anyone can't directly change any data
```java
public class MyClass {
    public static void main(String args[]) {
        Bank sbi = new Bank();
        sbi.deposit(5000);
        System.out.println(sbi.getBalance());
    }
    
}
class Bank{
    private int BankBalance;
    public int getBalance(){
        return BankBalance;
    }
    public void deposit(int amount){
        BankBalance+=amount;
    }
    public void withdraw(int amount){
        if(BankBalance>amount){
            BankBalance-=amount;
        }
    }
}
```

# Q7 : 
Answer :- 
No Java isn't 100% object oriented Programming Language because it contains primitve data types etc.

# Q8 :-
Answer :- Abstraction Helps to hide the irrelevant details from the user. this ensures the security of the data. Suppose a user can see the news but he don't have to worry about how it works

# Q9 :-
Answer :- Abstraction is the process of hiding the unnecessary information from the user and showing the necessary information only.

Abstraction helps to simplify complex system or concepts by breaking them Down in more manageable and Understandable parts.
 To Achieve abstraction we use the abstract keyword.
We can’t create the object of abstract class because abstract class are only a idea not implementation.
Example :- vehicle is actually a idea . we use vehicle class to get car , bike etc. 

A abstract method is declared inside a abstract class.
A abstract method is a method which have only method signature without body.


```java
public class MyClass{
    public static void main(String args[]){
        Car car= new Car();
        car.speed(80);
        System.out.println(car.getMileage());
    }
}

abstract class Vechicle(){
    int mileage;
    int speed;
    public void getSpeed(int speed){
        this.speed=speed;
    }
    abstract void getMileage();
    abstract void setMileage(int mileage);
}

class Car implements Vechicle{
    public int setMileage(int mileage){
        this.mileage=mileage;
    }
    public void getMileage(){
        return mileage;
    }
}
```

# Q10 :
Answer :- Final Class in java is that class which can't be inherited by anyother class. any class can be converted to Final class by the use of final keyword.