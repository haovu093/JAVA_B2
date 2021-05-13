import java.util.Scanner;

public class VongLap {
    void ForWhile() {
        String ten;
        String dc;
        int old;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Nhập thông tin của user thứ  " + i);

            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Nhập tuổi: ");
            old = sc.nextInt();

            System.out.println("Nhập tên: ");
            ten = sc1.nextLine();

            System.out.println("Nhập địa chỉ: ");
            dc = sc1.nextLine();

        }
    }

    void DemSo() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else {
                System.out.println(i + " Không phù hợp");
            }
        }

    }

    void TongSoChan() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n: ");
        n = sc.nextInt();
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tong = tong + i;
            }
        }
        System.out.println("Tổng các số từ 0->n= " + tong);
    }



    int TimSoChan() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("a là số chẵn");
        } else {
            System.out.println("a k là số chẵn");
        }
        return a;
    }

    void kiemTraSNT() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        n = sc.nextInt();
        for (int i = 2; i <= n/2; i++)
            if (n%i == 0) {
                System.out.println(n + "  k là số nguyên tố");
                break;
            }
        else {
                System.out.println(n + " là số nguyên tố");
                break;
            }



    }
}







