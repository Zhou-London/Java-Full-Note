package week3.TutorSession.src;

public abstract class food {
    private String name;

    public food(String name) {this.name = name;}
    public String getName(){return name;}

    public abstract String eatFood();
    public abstract String buyFood();

}
