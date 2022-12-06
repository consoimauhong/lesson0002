import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        //khai bao bien
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        //tao doi tuong input
        Scanner input = new Scanner(System.in);
        //nhap gia tri cho bien
        System.out.println("Enter ivestment amount: ");
        money = input.nextDouble();
        //nhap thang gui
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        //nhap lai suat
        System.out.println("Enter annual  interest rate in percentage: ");
        interestRate = input.nextDouble();
        // tinh lai suat nhan duoc
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
