package strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String pic = "   *  "
                +
                System.lineSeparator()
                +
                " * * * "
                +
                System.lineSeparator()
                +
                "* * * * ";
        return pic;
    }
}
