package liskovSubstitution.step3;

public class Step3Application {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        printArea(rectangle);
    }

    public static void printArea(Rectangle rect) {
        rect.setWidth(4);
        rect.setHeight(5);
        System.out.println(rect.area());
    }

}
