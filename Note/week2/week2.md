# Week2

Note for week2

# Lecture 4

Jan 20 Mon, Zhouzhou Zhang

## List Iteration

In java there are two main ways to iterate an array. Use the C style

    for(int i = 0; i < arr.length; i++)

Or use the new style. Just like the "for n in ls" in Python

    for(int n: arr)

## Containers Classes

-   List: ArrayList, LinkedList
-   Map: HashMap, TreeMap
-   Set: TreeSet, HashSet

## Generics and Non-generics

Just like "void*" in C, Java has such Data types that can contain various types of data structures.
For ArrayList, a type can be declared like the template in C++. Notice that the data type inside the
"<>"(like some Html...) must be an object while "int", "float" or something like that is not an object
but primitive data type. The object-version of a primitive data type is called wrapped type. For int,
it is "Integer", for "double", it is Double...
    
    ArrayList<String> sa = new ArrayList<>();
    ArrayList<Integer> ia = new ArrayList<>();

By the way, don't forget to import the library. IDEA will have done it for you automatically just
in case you are using some editors else.

    import java.util.ArrayList;

ArrayList can not be accessed using "[]" like vectors or Python-list. Method "get()" is necessary
to access the element inside an ArrayList

    sa.get(0); //Return first element

ArrayList is dynamic and it can grow and shrink. Use "add()" to push back and "remove({index})"
to pop. No "pop_back" is implemented but you can rather use .remove(arr.length - 1).

    sa.add("hello");
    sa.remove(sa.length - 1)

forEach method can be used to iterate an ArrayList, very similar to that one in JavaScript.
And again don't forget to include the ArrayList library.
    
    import java.util.ArrayList;
    sa.forEach(item -> {
        System.out.println(item);
    })

ArrayList can be also non-generic(Roberts told us not to use it) by not declaring the type
in that "<>". When using such kind of ArrayList to assign value to a variable or something
like that, remember to prefix a casting like "(String)ArrayList.get(1)" as itself does't have
a data type.

    ArrayList nga = new ArrayList();

## Map

A Map can be recognized as the dictionary in Python. And the way to declare a Map is quite
similar to ArrayList. There is always type-checking for a Map so take care that you use
the correct data type.

    HaskMap<String, Integer> sim = new HaskMap<>();
    
Map maps between the key and the value. Use method "put()" to push back a new pair of
"key-value".
    
    sim.put("One", 1);
    //String to Integer

## Main function in Java

Java needs a main function just like C. The difference is that this main function has to
take a command line arguments. Recap C of its "char* argv[]", that means a list of String.
For Java it is quite different, that "String[] argv", still meas a list of String.

    public static void main(String[] argv){
        //...
    }

## Java Array

For Java Array, not like C, the bound-checking is always applied.

    int n = arr[2];
    n[3] //error

The index of Java Array is also started from 0.

    int[] a = new int[10];
    a[0]; //return first element

The length of a Java Array can be set to empty. It is useful in the case where you have a 
function to search for something and if that thing doesn't really exist then this function
can return an empty list which would make you know that there is no such thing. And actually
in C++ when you are searching for an element you have to check whether you successfully found it
or not using this way.

    int[] emp = new int[0];

Java Array would be initialised to default value, for int it is 0, for float it is 0.0, for
reference it is null and it can also be initialised to certain value using "{}"(there are two ways,
both acceptable).

    int[] a = new int[10];
    a[0]; //returns 0

    int[] arr = {1,2,3,4,5}
    int[] arr = new int[]{1,2,3,4,5}

Stream is a sequence that flows over the array. Values are pulled from the end rather than the start. 
For example, stream(arr) creates a stream using elements in arr. The method "sum()" can be used to reduce a stream into a single
value which is the sum of the whole stream. And don't forget to import the Arrays library.
    
    import java.util.Arrays;
    int sum = Arrays.stream(s).sum();

IntStream is a stream of Int. A bit like the "[1,2..]" in Haskell. This stream is infinite
and you should use something like "take 10 [1,2..]" to cut a stream out of certain length. In Java,
the function "take" is method "range". And the method "map" takes an argument which is quite like the lambda expression,
which means "take this value and return another value based on it". Hence, the following expression
is equivalent to "int sum = Arrays.stream(s).sum();"

    IntStream.range(0,arr.length).map(i -> a[i]).sum();

# Lecture 6 (I skipped lecture 5 ahaha)

Jan 23 Thu

## Design Pattern

Design Pattern is important in Software Development which is needed for you to understand
other developers. Robert recommends one book named Design Patterns: Elements of reusable Object-Oriented Software.

## UML- The Unified Modelling Language

UML provides a complete language for describing OO models and it is a bit like
programming languages. It is maintained by Object Management Group(OMG). 

-   Grady Booch
- James Rumbaugh
- Ivar Jacobson

## Java OOP

The syntax to build a constructor in Java is the following. A constructor is the function
that used to build a instance with certain parameters. "this" is quite like the "self"
in Python and is quite useful in some cases.

    class Person{
        public Person(String name){
            this.name = name;
        }
    }

Besides the constructor, there might be instance variables inside a object. Instance
variables can be declared like this.

    class Person{
        private String name;
    }

