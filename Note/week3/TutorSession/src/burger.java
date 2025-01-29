package week3.TutorSession.src;

public class burger extends food{

    @Override
    public String eatFood() {return "Calories + 500Cal";}

    @Override
    public String buyFood() {return "Money - 10$";}

    public burger(String name) {super(name);}


}
