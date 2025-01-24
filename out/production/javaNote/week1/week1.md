# 0.Introduction to Java(before lecture)

Zhouzhou Zhang

## OOP

In Java there are methods rather than functions. Methods are the functions be encapsulated into an object. 

    //function
    void hello();

    //object and method
    class hello{
        public void sayHello(){
            ...
        }
    }

For Java file, the class name must be the same with file name. If you write a class called hello, the file name should be hello.java. Inside the class there is a main method just like the main function in C it is the entrance of the whole program. 

    class hello{
        public static void main(String[] args){
            ...
        }
    }

A hello world program. Note that Java doesn't have "self" like Python so it would be a little bit more complex (still better than C++ though).

    class hello
    {
        public void sayHello(){
            System.out.println("Hello World");
        }

        public static void main(String[] args){
            hello h = new hello();
            h.sayHello();
        }
    }

## Compile and Run

First use "javac" command to compile the file and this would generate a ".class" file following the name of ".java" file.

    javac hello.java

Then use "java" command upon the ".class" file to run the program

    java hello

## Shorten the main method

Recap the hello class, we used the following code to declare a hello object and call its method.

    hello h = new hello();
    h.sayHello();

There is a way to shorten this if you want to call other methods inside this class just like you calling functions outside the main function in C.

    new hello().sayHello();

## Variable

-   boolean value is "boolean" rather than "bool" in any other language
-   ++, --, +=, -=
-   &&, ||, !
-   int, double
-   String rather than char *

## if-statement

Just like any other language.

    if(boolean-expression){
        ...
    }else{
        ...
    }

## Loops

See ex.java for more
-   while, do while just like C
-   for(int i; i < n; i++)
-   for(int n: arr) iterates an array, similar grammar found in C++ and Python

## Arrays

Use "new" to allocate memory to a variable(like C++) to create a list.

    int[] arr = new int[10];

Get the length. Why doesn't it need a "()" like ".size()" in C++? I am pretty curious...

    arr.length;

## Reference

Java reference is not pointer. The memory is not under the control of programmers, which enhances the safety of the program. Java reference is more like a marker that tags the data and then the data can be accessed somewhere else.

## String

String is a built-in data type in java. Note the first "S" is captial.

    String s = "Hello";

Comparison between String can not be done correctly using "==" as it is actually comparing the reference rather than the actual value. To compare two string, using the method inside class String, ".equals()"

    String s1 = "AB";
    String s2 = "CD";
    boolean b = s1.equals(s2);

You can also use ".compareTo()". The difference is that ".compareTo()" returns an integer. The return value will be less than 0 if s1 comes before s2.

    int i = s1.compareTo(s2);

The element inside String can not be accessed directly using "[]", which reminds me of the iterator in C++. You should use the ".charAt()" method.

    char c = s1.charAt(0);

## Random Number

Random is a class inside JDK.

    import java.util.Random

Declare a Random object

    Random r = new Random(); //You can pass a seed into it

Print random number

    System.out.println(r.nextInt());

# Lecture 1

Jan 13 Mon 2025, Zhouzhou

## jshell

jshell is obviously a shell of java. Just like the interepter of Python.

    $ jshell --version
    jshell 23.0.1

To enter jshell, type in "jshell" in a shell.

    $ jshell
    jshell> ...

To exit jshell, press ctrl + D or type in "/exit?"

    jshell> /exit
    good bye

# Lecture 2

Jan 15 Wed 2025, Zhouzhou

## JVM

JVM is Java Virtual Machine. It doesn't emulate CPU but only interept Java bytecode. 
Unlike C compiler where all the code can not be changed after compiling, Java's bytecode
can be changed dynamically.

