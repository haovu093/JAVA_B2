import java.util.Scanner;

public class Checktg {
    int a,b,c;
    void  checkTamGiac(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a: ");
        a = sc.nextInt();
        System.out.println("Nhập độ dài cạnh b: ");
        b = sc.nextInt();
        System.out.println("Nhập độ dài cạnh c: ");
        c = sc.nextInt();
        // Kiểm tra 3 cạnh có phải cạnh của 1 tam giác không?
        if (a+b> c && b>a+c && a>b+c)
        {
            System.out.println(a+","+b+","+ c+" là 3 cạnh của tam giác");

        }
        else {
            System.out.println(a+","+b+","+ c+" không là 3 cạnh của tam giác");
        }
    }
}
