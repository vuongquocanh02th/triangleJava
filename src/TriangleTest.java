import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập màu sắc của tam giác
        System.out.print("Enter the color of the triangle: ");
        String color = scanner.nextLine();

        // Nhập độ dài ba cạnh của tam giác
        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();

        // Tạo đối tượng Triangle với các tham số đã nhập
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color); // Đặt màu sắc cho tam giác

        // Hiển thị thông tin về tam giác
        System.out.println("\nInformation about the triangle:");
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
