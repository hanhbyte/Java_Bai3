import java.util.Scanner;

public class Rectangle {
    double width,height;
//    public Rectangle() {
//
//    }
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPremiter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Hình chũ nhật : {" + "Chiều rộng = " + width + ",Chiều cao = " + height + "}";
        }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chiều rộng : ");
        double width = scan.nextDouble();
        System.out.println("Nhập chiều cao : ");
        double height = scan.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật \n"+rectangle.display());
        System.out.println("Chu vi của Hình chữ nhật: "+rectangle.getPremiter());
        System.out.println("Diện tích Hình chữ nhật: "+rectangle.getArea());
    }
}