package week1.src;

public class Person {
    private int age;
    private String school;
    private String name;
    public Person(int age, String name, String school){
        this.age = age;
        this.school = school;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getSchool(){
        return school;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Person p = new Person(20, "John", "UCL");
        System.out.println(p.getAge());
    }
}
