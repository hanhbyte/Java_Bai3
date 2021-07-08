import java.util.Scanner;

public class QuadraticEquation {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập hệ số căn bậc 2, a = ");
        float a = QuadraticEquation.scan.nextFloat();
        System.out.print("Nhập hệ số căn bậc 1, b = ");
        float b = QuadraticEquation.scan.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scan.nextFloat();
        QuadraticEquation.PTB2(a, b, c);
    }

    public static void PTB2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                System.out.println("Phương trình có 1 nghiệm : " + "x = " + (-c / b));
            }
            return;
        }
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm : "+" x1 = " + x1 +"và x2 = "  + x2);
        }else if (delta == 0){
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép : "+"x1 = x2 = " + x1);
        }else{
            System.out.println("Phương trình cô nghiệm !");
        }
    }
}
