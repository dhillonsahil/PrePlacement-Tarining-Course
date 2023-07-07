# Q1 : What is Exception in Java?
Answer : An Exception is a Run time Error which occurs due to Logical Errors or Other Errors Like Memory Limit Exceeded, Resource Issue. The Exceptions interrupt the flow of the program and the program finishes without completing the Work.

# Q2 : What is Exception Handling?
Answer :  Exception Handling Includes writing the code in the try catch block so that if any error comes that can be handeled easily. if the program is unnable to handle the exception we can complete some task like closing databases, files etc. to prevent the data with the help of finally block.

# Q3 : What is the difference between Checked and Unchecked Exceptions and Error?
Answer : **Check Exception** :- A Checked Exception is caught at the run time if there is any issue it will say to handle that Like class not Found, Method Not Found.
**Unchecked Exception** :- A Unchecked Exception is caught at run time like Arithmetic Error,Null Pointer error , Array Index out of Bound etc.

**Error** :- An error  occurs due to the wrong syntax. Suppose somewhere semicolon(;) is missing , A statement is unreachable.

# Q4 :- 
Answer :- Throw Statement is used to throw a Error by own like throw new Exception("Unknown issue); But throws statement is used so if any issue is caught it is passed to the Calling method. If we use Throws with main and if any exception comes in main method it will be passed to JVM, if we want we can hanle that exception in Main.

# Q5 :- What is multithreading in Java? mention its advantages
Answer :- Multithreading is a independent process. which is not dependent on other applications and a single applications can have many threads.
Suppose we use zoom app to video call . chatting is independent of Video , audio if they are enable or disabled they will not have any impact on that.
The Main advantages of the Multithreading is that 
1. It can reduce the time required to perform certain task
1. Improved Cpu Utilization
1. Reduced Idle CPu

# Q6: Write a program to create and call a custom exception
Answer :
```java
public class MyClass {
    public static void main(String args[]) {
        int a=10;
        try{
            throw new MyException("Issue while dividing");
        }catch(MyException e){
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
```

# Q7 :
Answer :- Exceptions in Java can be handled with the help of try catch block. A single try can have more than one type of Catch. 
```java
public class MyClass {
    public static void main(String args[]) {
        int a=10;
        try{
            int b=a/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        
    }
}
}
```

# Q8 :
A thread in Java is the flow of excecution which tells which line will be printed Next. All the programs/processed we do in Java are done with the help of thread. For executing the Main JVM creates a thread main thread. we can set the priority of thread from 1 to 10. 1 for lowest 10 for highest.

# Q9 :
Answer :
Thread Can be implemented by the following two ways.
1. By the help of runnable Interface where we have to define the run method.

```java
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

```
1. The Second way is by using the Thread Class.
```java
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

```

# Q10 :
Answer : Garbage Collection in Java means where ever ther is an object in java which has no referring variable (no variable is pointing/referring to that Object) then that object is removed from memoruy by the garbage collector. This is called Garbage Collection.

