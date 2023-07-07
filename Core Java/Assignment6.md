# Q1 :
Answer : Collection is a interface in Java which is Implemented by various classes to provide us the different data structrues. It provides way to store, retreive and process group of objects. 

# Q2. Differentiate between Collection and collections in the context of Java.
Answer : Collections is A utility class in Java which provides several methods in Java to work with collections. It is a class within the collections framework

Collection serve as a root interface for other classes within Java framework class. And it is a framwework which is implemented by all the classes or extended by all the interface of the Collections.

# Q3 :
Answer :
Advantages of Collection Framework :- 
1. No need to write The code for creating data stuctures like array list etc.
1. Provide the classes to create Dynamic Size Data Structure.
1. We Can create No Linear Data Structures.
1. Time Complexity of Some Progams can be reduced by using Collection Framework classes.
1. Support for Genrics So that only a specific type of data can be added.
1. Reusability and Interoperability.

# Q4 
Answer : 
1. Collection :- Root interface for all the interfaces and provide basic opeations like manipulating and retreiving etc.
1. List :- Provide Classes Like ArrayList (Linear , Randomly Access), Linked List(non linear, no randomly access). Maintains order of insertion. Allow duplicate elements
1. Queue :-  BAsed on first Come first serve insert from one end and pop from another.
1. Set :- Don't Maintain any Order. No Duplicate elements allowed. 
1. Map :- To insert the elements by mapping with each other no duplicate allowed. if added previous value will be deleted

# Q5 :
Answer :
| List | Set |
|------|------|
| Duplicate Allowed  | No Duplicate Allowed |
| Ordered | Not Ordered |
| Index Based Accessing Allowed eg. Array List | No index Based Accessing Allowed |

# Q6 :
Answer : 
| List Iterator | Iterator |
|--------------| ---------|
| Only on List Implementing Classes | On Every Collection |
| Bidirectional  | Only forward Direction Allowed |
| Supports Index Based Operations | Doesn't Support | 
| hasPrevious() , previous() available | No such Methods |

# Q7 :
Answer :**Interface Implementation**: The Comparable interface is implemented by a class to define a natural ordering for its instances. This means that the class itself specifies how its objects should be compared to each other. On the other hand, the Comparator interface is a separate entity that can be implemented by a different class to provide custom comparison logic for objects of a particular class or across multiple classes.

**Single vs. External Comparison Logic**: With Comparable, the comparison logic is defined within the class being compared. It means that the class provides its own implementation of the compareTo() method, which is used to compare instances of that class. On the other hand, Comparator provides a separate class with a dedicated implementation of the compare() method, allowing for external comparison logic that can be applied to objects of different classes.

**Object Modification**: Implementing Comparable requires modifying the class itself, as the comparison logic is directly tied to the class implementation. In contrast, using Comparator allows comparison logic to be implemented independently of the class being compared. This can be useful when you want to apply different comparison strategies or when modifying the class is not feasible.

**Flexibility and Reusability**: Comparator provides greater flexibility and reusability compared to Comparable. With Comparator, you can define multiple comparison strategies for the same class or compare objects of different classes without modifying them. This flexibility is especially useful when working with classes that you don't have control over, such as classes from external libraries.

**Sorting Order**: Comparable defines the natural ordering for objects. It means that the class itself specifies how its instances should be ordered. This natural ordering is used when sorting objects using methods like Collections.sort() or Arrays.sort(). Comparator, on the other hand, allows for custom ordering criteria to be defined separately, enabling sorting in various ways that may differ from the natural ordering.

# Q8 :
Answer :  Collision Happens In Map when two or More same keys are trying to be get mapped in Map. But Map Requires unique key for every entery and this issue can be solved with the help of the Chahining PRocedures.

# Q9 :
Answer : 
| HashMap | TreeMap |
| --------| -------- |
| No speicific Order of keys | Sorted Order of keys |
| O(1) T.C. for basic Operations like retreiving | O(n)  T.C. |
| Uses array and LinkedLists | Uses Tree |
| allow a single null key | no null key allowed |


# Q10 :
Answer : LinkedHashMap :-
1. To Store Order of insertion 
1. List Iterator can be used.
1. It is non-synchronized.
1. Performace is Same Like HashMap.