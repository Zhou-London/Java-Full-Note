`# Note for Programming Tutor Session Week2

Jan 24 Fri, Zhouzhou

## Generic

Much like the "void*" in C. Java allows you have not declared the exact type of a function
or a class. For example, for a hash map, you don't want to always specify what the exact
data types are. A hash map might be "int to String" or "String to String" whatever. The
following is a "int to String" hash map.

    1: "Apple"
    2: "Banana"

The way to declare this hash map might look like this...

    class Pair{
        private String value;
        private int key;
        public Pair(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

Notice that we declared the type of key and value. However we want to make a generic
version where you don't have to specify the exact type. What if you want a hash map for
"int to float"? You wanna build another class? Come on! Let's make it this way. It's a bit
like templates in C++.

    class Pair<K, V>{
        private K key;
        private V value;
        public Pair(K key, V value){
            //...
        }
    }

## HashMap

Now let's focus on how to implement the HashMap. Our code above is just about a single pair,
while a HashMap is a table of pair with O(1) in searching. First let's declare our class name.

    public class MyHashMap {
        //...
    }

Let's say that our version of HashMap should have a max length. Hence we need a variable
to store this length and this variable might be a constant. The "const" in java is "static".

    private static final int LENGTH = 16;

Next, we are going to build the table. The table is a list of Pair, so obviously we need
an ArrayList of Pair. Furthermore, inside this ArrayList, each element should not only
be a single pair, but multiple pairs that connected to each other as we might have the 
same hash. Hence, the table should be a list of ArrayList. If you are confused, google
hash map and find a picture about the visual table.

    ArrayList<Pair<Integer, String>>[] table;

