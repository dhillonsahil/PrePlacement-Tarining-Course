# Q1 : What is the difference between Compiler and Interpreter
Answer : 
**Compiler** :- A Compiler converts the source code to Machine Level Code so it can be execute on the machine. It Converts the complete code by reading the complete code once.

**Interpreter** :- Like A Compiler it also converts HLL code to MLL code. But it reads the code Line By Line and if same code is coming again and again it will take more time as compared to compiler because same code is getting converted again and again to MLL.

# Q2 : What is the difference between JDK, JRE, and JVM?
Answer :- 
**JVM** :- JVM executes the class file and give us output.
**JRE** :- It provides the libraries required by the JVM to execute our code.
JRE = JVM + Run time Libraries
**JDK** :- It Provides More tools required by the java Developer example :- JIT Compiler , java compiler.
It includes JRE and JVM and other tools.

# Q3 : How many types of memory areas are allocated by JVM?
Answer :- There are 5 types of memory allocated by the JVM :- 
1. Heap :- It is used to store allocated Objects in Java
1. Stack :- Used to store Method Calls and other variables
1. PC register :- Used to store Addrress of the instuction being executed and which is next.
1. Native Method Stacks :- for executing the code written in other languages example C++, C.
1. Method area :- To store the staic Data , class Structures etc.

# Q4 : What is JIT compiler?
Answer :- If a code is coming again and again suppose a method is called 5 times so the interpreter will translate the same code 5 times so to reduce that time JIT compiles that code once and whenever that code is required it will be given to interpreter.

# Q5 : What are the various access specifiers in Java?
Answer :- public, private, protected , abstract , strictfp , final , static , synchronized , native , transient , volatile

# Q6 : What is a compiler in Java?
Answer : Java Compiler Converts the HLL code to bytecode which is neither HLL nor MLL. The ByteCode is executed by the JVM. The same byte code can be executed on any time of Machine which has the Java Installed.

# Q7 : Explain the types of variables in Java?
Answer :- 
1. Local Variable :- That has a Limited to scope to within a function and block.
1. Static Variable (Class Variable ):- The value of static variable will be the same for every instance of that class.
1. Instance variable :- Instance Variable are declared with in a class outside method Like static method but the value can be of Instance Variable can be changed for every Instance.

# Q8 : What are the Datatypes in Java?
Answer :- 
**Primitive Data Type**
1. byte
1. short
1. int
1. Long
1. boolean
1. char
1. double
1. float

**Non Primitive**
1. Array
1. String
1. Enumerations
1. Class
1. Collections
1. Interfaces

# Q9 : =What are the identifiers in java?
Answer :- 
1. Method Names
1. Class , Interfaces Name
1. Reserved Words
1. Variables Names 

# Q10 : Explain the architecture of JVM 
Answer :- 
JVM Consists of the following Components :- 
1. Class Loader :-  Loads the main code in to main memory to be executed.
1. Memory Area :- The Memory Allocated to the program(like objects , variables etc) is called Memory Area
1. Execution Engine :- It consists of the :- 
**JIT Compiler** which is responsible for the optimizing the performance and translating the java bytecode to Machine Language.
**Interpreter** :- executes the byte code line by line

1. Garbage Collector :- Delete the objects / values from the memory which has no reference