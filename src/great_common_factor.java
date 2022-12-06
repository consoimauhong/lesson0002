import java.util.Scanner;

public class great_common_factor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = input.nextInt();
        System.out.println("Nhap so b: ");
        b = input.nextInt();
        // dùng hàm abs() để trả về giá trị tuyệt đối(+) của a,b
        a = Math.abs(a);
        b = Math.abs(b);
        //ktra a,b co bang 0 hay k?
        if(a ==0 || b == 0){
            System.out.println("khong phai la uoc chung");
            }
        //tim uoc chung dung vong lặp
        while ( a != b){
            if(a > b)
                a = a - b;
            else
                b = b - a;
            System.out.println("So uoc chung lon nhat la: " + a);
        }
    }
}
