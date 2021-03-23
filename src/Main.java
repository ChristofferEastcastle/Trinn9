import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(4, Color.BLUE, false, new MovablePoint(4, 4));
        Rectangle r = new Rectangle(20, 40, Color.GREEN, true,
                new MovablePoint(8, 10), new MovablePoint(48, 30));

    }
}
