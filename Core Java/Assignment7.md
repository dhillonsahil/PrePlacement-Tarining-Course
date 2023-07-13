# Q1 
Answer : JDBC stands for Java Database Connectivity. JDBC is a Java API that provides a standard way for Java programs to interact with databases. It enables developers to perform various database operations, such as connecting to a database, executing SQL queries, retrieving and updating data, and managing database transactions.

# Q2 :
Answer :
1. Load The Driver :- The driver class is typically provided by the database vendor and can be loaded using the Class.forName() method.

1. Establish a database connection :-  You need to provide the necessary connection details, such as the database URL, username, and password. The DriverManager.getConnection() method is used to create a Connection object representing the database connection.

1. Create a statement :- After establishing the connection, you can create a Statement or PreparedStatement object.. The Statement object is used to execute SQL queries and statements, while the PreparedStatement object allows you to execute parameterized queries with placeholders.

1. Execute SQL queries
1. Process the result
1. Close resource.

# Q3 :-
Answer : 
