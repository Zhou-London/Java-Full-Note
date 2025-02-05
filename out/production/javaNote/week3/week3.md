# Note for Week 3 COMP0004

Zhouzhou

# Lecture 7

Jan 27 Mon, Zhouzhou

## Objects

Object is an instance of a defined class where all the instance variables and methods
are encapsulated into it. For a same class there might be many objects and each object is
independent to each other. Below is the main concepts for OOP.

-   Private: Private methods or variables are only accessible inside the scope of class.
-   Public: Public methods or variables are always accessible even outside the scope of class.
-   Encapsulation: Everything(variables and methods) is within the scope of class.

Once an instance object is defined. The object variable, like person, is a reference to its
object table where all methods and variables are stored in. A reference is bit like a pointer, but
not really a pointer which stores the address of a memory chunck. Instead, a reference is a table
that guides it to the destination.

    Person person = new Person("Harry", "Potter");

Objects can be referenced to null. Reference to Null means there is no reference, which means
this variable has not yet been defined. And it is the default state if you do not initialise it.

    Person person = null;

NullPointerException occurs when you call "methods" on an object with null reference. As the
reference is null, this object doesn't know his instance variables and methods so don't you able
to call a method or variable that doesn't really exist.

    person.name; //error

When passing one object variable as a parameter, it actually copy the object and create a new one
inside the scope of that function/method. Hence, changing the object inside doesn't really change the
outer value.

    method(Person person);
    person;//Still the same

The lifetime of an object is as long as this object is accessible. But the lifetime of its reference
may be different. 

## Primitive Types vs Objects

Primitive Types like int and double are being implemented through binary code rather than 
Java OOP syntax. So they are not objects and they have no reference. And that's why we need
Integer and Double which are the object-verison of these primitive types.

    int 10;
    Integer 10;

Primitive is copied by its value. Objects are copied by its reference. They are both copied
when passing to a method but the mechanism is kind of different. Note that no matter if it is
copied by its value or copied by its reference, they are both copied, so they are both called
"call by value" but not "call by reference". In "call by reference", the data is not copied. 
However, Java doesn't support this thing, C++ does.

    void acc(int& a){ return a++; }
    int a = 10;
    f(&a);
    a; //return 11

# Lecture 8

Jan 29, Zhouzhou

## Design Principles in OOD

-   Design Patterns
- Refactoring: The process to refine the code
- Unit Testing and TDD: 
- Dependencies and dependency injection
- Composition over inheritance
- Low of Demeter