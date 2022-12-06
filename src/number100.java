import java.util.Scanner;

public class number100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số vào: ");
        int number = scanner.nextInt();
        int count = 0;
        if (number < 2) {
            System.out.println(number + "khong phai là so nguyen ");
        } else {

            for (int i = 2; count < 100; i++) {
                int n = 2;
                boolean check = true;
                while (n < i) {
                    if (i % n == 0) {
                        check = false;
                        break;
                    }
                    n++;
                }
                if (check){
                    System.out.println(i);
//                    System.out.println(number + "la so nguyen to");
                    count++;

                }
            }

        }
    }
}
