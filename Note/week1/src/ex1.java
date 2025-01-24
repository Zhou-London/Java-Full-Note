package week1.src;
//Week 1 Java Note
//Simple example of loop in Java


class ex1{
    public void displayMessage(){
        int n = 0;
        while( n++ < 10){
            System.out.println(n + ": Hello World!");
        }
    }

    public static void main(String[] args){
        new ex1().displayMessage();
    }
}