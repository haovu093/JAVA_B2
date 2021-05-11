import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Month {
    int n;

    void tinhThang() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một tháng bất kỳ:");
        n = sc.nextInt();
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("tháng " + n + " là tháng có 31 ngày");
                break;
            }
            case 2: {
                System.out.println("tháng " + n + " là tháng có 28 or 29 ngày");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("tháng " + n + " là tháng có 30 ngày");
                break;
            }
            default:
                System.out.println("Không có tháng phù hợp");
                break;


        }
    }

}
