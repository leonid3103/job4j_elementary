package strategy;

public class Square implements Shape {
    @SuppressWarnings("checkstyle:OperatorWrap")
    @Override
    public String draw() {
        String pic = "* * * *"
                +
                System.lineSeparator()
                +
                "* * * *"
                +
                System.lineSeparator()
                +
                "* * * *"
                +
                System.lineSeparator()
                +
                "* * * *";
        return pic;
    }
}
