import org.w3c.dom.css.Rect;
import java.util.Scanner;
import java.awt.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        System.out.println("box1: " + box1);

        Rectangle box2 = new Rectangle(100, 50);
        System.out.println("box1: " + box2);


        box1.move(20, 20); // or box1.setLocation(20, 20);
        box2.resize(50, 30); // or box2.setSize(50, 30);
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();

    }

}