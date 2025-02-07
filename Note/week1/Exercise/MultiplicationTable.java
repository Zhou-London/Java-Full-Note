package week1.Exercise;

public class MultiplicationTable {
    private void displayTable(final int n){
        int counter = 1;
        System.out.println("The " + n + " times table");
        while(counter < 13){
            System.out.print(counter + " x " + n);
            System.out.println(" = " + counter * n);
            counter++;
        }
    }

    public void doTable(){
        Input in = new Input();
        System.out.print("Which table? (2-12): ");
        int x = in.nextInt();
        if((x<2) || (x>12)){
            System.out.println("Invalid input");
        }else{
            displayTable(x);
        }
    }

    public static void main(final String[] args) {
        new MultiplicationTable().doTable();
    }
}
