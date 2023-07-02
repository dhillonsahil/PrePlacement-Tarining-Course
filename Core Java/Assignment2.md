# Q1. What are the Conditional Operators in Java?
Answer : There are three Type of conditional Operators in Java 
1. AND operator( Symbol :- &&)
1. OR operator (Symbol :- ||)
1. NOT operator (Symbol :- !)

# Q2. What are the types of operators based on the number of operands?
Answer : On the basis of number of Operands there are two types of operators :-
1. Binary Operator :- Works on two operands :-
> 1. Arithmetic :- Addition , subtraction , multiplication , divide, modulo 
> 1. Relational :- less than , less than equal to , greater than  , greater than equal to , equals to , not equals to
> 1. Conditional Operators :- And , Or , Not
> 1. Bitwise Operators :- Bitwise and , Bitwise Or, Bitwise Not , BitWise Xor

2. Unary Operator :- works on 1 operand
>1. Unary +
> 1. Unary -
> 1. Increment ++;
> 1. Decrement --;
> 1. Bitwise Left Shift
> 1. Bitwise Right Shift
>1. Bitwise Compliment
3. Ternary Operator :- works on 3 operands
> 1. condition ? value1 : value2


# Q3. What is the use of Switch case in Java programming?
Answer : Switch Case statements are used to execute any statement based on the value of the expression
we can pass values to switch using that if value matches any case that switch statement case will execute. we can add a default case if value matches no case than it executes the default

# Q4. What are the conditional Statements and use of conditional statements in Java?
Answer : Conditional Statements are used to control the flow of the program based on the values :-
1. if statement
1. if else
1. if else if else
1. switch

# Q5. What is the syntax of if else statement?
Answer : in if we will check two condition if that satisfies it will run if block otherwise else block
```bash
if(5<10){
    System.out.println("Smaller")
}else{
    System.out.println("Larger")
    
}
```
# Q6. How do you compare two strings in Java?
Answer : To Compare two Java Strings we can do two things. 
>1. Using a Loop and checking each character of the Strings

**example Syntax**
```bash
boolean flag=true;
String name="sahil";
String name2="Dhillon";
int i=0,j=0;
while(i<name.length() && j<name2.length()){
  if(name.charAt(i)!=name2.charAt(j)){
    flag=false;
    break;
  }
  i++;
  j++;
}
if(i!=name.length() || j!=name2.length()){
    flag=false;
}
```
>1. Using .equals

**example Syntax**
```java
String name="sahil";
String name2="Dhillon";
boolean res=name.equals(name2);
```

# Q7. What is Mutable String in Java Explain with an example
Answer : Mutable String in Java which can be changes without creating the new instance. Values are directly added or removed from that Instance

In Java String Buffer and String Builder are the two Mutable String classes.

# Q8. Write a program to sort a String Alphabetically
Answer : 
```java
public class MyClass {
    public static void main(String args[]) {
        String name="abcdefghijkl";
        char arr[]=name.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        name=String.valueOf(arr);
        System.out.println(name);
    }
}
```

# Q9 : Write a program to check if the letter 'e' is present in the word 'Umbrella'.
Answer : 
```java
public class MyClass {
    public static void main(String args[]) {
        String text="Umbrella";
        boolean flag=false;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='E' || text.charAt(i)=='e'){
                flag=true;
                break;
            }
        }
        if(flag)System.out.println("Yes ! It Exists");
        else System.out.println("No ! It doesn't Exists");
    }
}
```

# Q10. Where exactly is the string constant pool located in the memory?
Answer :  String Constant Pool exists in the heap memory , used to store String literals. if the string already exists a refrence of that is provided to new variable.