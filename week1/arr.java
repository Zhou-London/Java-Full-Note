//Sample code of array-manipulation

import java.util.Arrays;

class arr{
    public static void main(String[] args){
        int[] a = new int[10];
        //Initalize the array
        for(int i = 0; i != a.length; i++){
            a[i] = 0;
        }

        //Treat array as stream, for each element inside the array apply a method to it. The method
        //should be passed into forEach() just like function pointer in C, using "::"
        Arrays.stream(a).forEach(System.out::println);
    }
}