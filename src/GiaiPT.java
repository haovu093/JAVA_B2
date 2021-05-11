import java.util.Scanner;

public class GiaiPT {
    // hệ số
    float a, b, c;
    // x1, x2 là nghiệm của phương trình
    float x1, x2;
    //delta
    float delta;

    void GiaiPTB2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số bậc 2 a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số bậc 1 b: ");
        b = sc.nextInt();
        System.out.println("Nhập vào số thực c: ");
        c = sc.nextInt();

        // Kiểm tra nghiệm của pt bậc 2
//        if (a + b + c == 0) {
//            System.out.println("Phương trình có 2 nghiệm: " + "x1 = 1 " + "và x2 = " + (c / a));
//
//        } else if (a - b + c == 0) {
//            System.out.println("Phương trình có 2 nghiệm: " + "x1 = -1 " + "và x2= " + (-c / a));
//
//        } else {
        // tính delta
        delta = b * b - (4 * a * c);
        if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }


}
//        }
