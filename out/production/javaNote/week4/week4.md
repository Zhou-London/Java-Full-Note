# Note for Week 4 COMP0004

Zhouzhou

# Lecture 10

Feb 3 Mon, Zhouzhou.

Yeah I skipped lecture 9 (buying 5090) hahaha

## Exception

Of course Java has **Exception** mechanism and you may have seen a lot in your ENGF34
coursework. Exception is used to catch the run-time error and maybe continue the program and bypass 
that error or handle that error. For example, when divide by zero, this should be an exception.
The program will end immediately to avoid the undefined behaviour.

    int n = 1/0; //error!

Checked exception is that you will do something if an error is detected, while the unchecked
expcetion is that you just end the program if that error is detected. Generally checked
exception is better. 

## Stack

Error Handling is considered a stack. Stack is a queue which is Last-In-First-Out. I guess ENGF34 has
taught you about it. A stack can push and pop values, the last value pushed is the first value
being popped. The ArrayList in Java can be used as a stack too so don't you really need to
implement one on your own. One thing you should notice is the notion of generic, which is discussed
in week2's tutor session.

    stack.push(1)
    stack.push(2)
    stack.pop() // 2 is gone!

## Handle Exception

The most simple way is to use an if-statement. For example, when peeking a stack, you can simply
return null if some specific error is detected. And return the value if everything is good.

    if(stack.length > 0){
        return stack.peek();
    }else{
        return null;
    }

Another better way is to use assert. Still, you can see a lot of assertions in Mark Handly's videos.
assert takes a boolean expression. If that is true then the program will ends.

    assert values.size() != 0;

The best way is to use an exception. It will let the compiler check the code and force
the programmers to write the code in the way you want.

    public T pop() throws EmptyStackException{
        if(values.size() == 0)
        { throw new EmptyStackException(); }
        else
        { return values.remove(getLastIndex()); }
    }

Using option is also a good way. 

    public Optional<T> pop()
    {
        if(values.isEmpty()){
            return Optional.empty;
        }else{
            return Optional.of(values.remove(getLastIndex()));
        }
    }

When you should return a value, especially when writing a function, Optional is better. If
you are writing something else where not even a null can be returned, then Exception would
be better. 

## Try and catch

You are not probably write many ifs for a long code block. That's why we need try and catch. Try
will run a block of code and catch will catch the errors specified. catch should take an argument
which is a class of Exception. There are many classes of Exception, such as NumberFormatException...

    try{
        a.dosomething();
    } catch (SomeException e){
        //Handle this
    }

Finally is another block, other than try and catch. The code inside the finally is guaranteed to
be run, whatever it happens in try-block.

    try{}
    catch(){}
    finally{}

When it comes to File IO, we can use try with resources. 

## Exception Class

The following is the hierarchy of Exception Class.

-   Throwable
- Error (extends throwable)
- Exception (extends throwable)
- RuntimeException (extends Exception)

You can define your own Exception class using inheritance.  

    class MyException extends Exception
    {
        public MyException () { super(“Default message”) ; }
        public MyException (String s) { super (s) ; }
    }

The main methods provides by Throwable is the following. The extensions of throwable
can have more methods and variables.

-   A String storing the message
- getMessage() to return that string
- printStackTrace() to print the stack frames