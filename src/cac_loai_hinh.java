import java.util.Scanner;

public class cac_loai_hinh {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                {
                    System.out.print("Enter width: ");
                    int a = input.nextInt();
                    System.out.println("Enter height: ");
                    int b = input.nextInt();
                    for (int i = 1; i <= b; i++){
                        for (int j = 1; j <= a; j ++){
                            System.out.print("*");
                        }
                    }
                };
                break;
                case 2: {
                    System.out.println("Choose the kind of triangle");
                    System.out.println("1. Draw the top-left");
                    System.out.println("2. Draw the top-right");
                    System.out.println("3. Draw the botton-left");
                    System.out.println("4. Draw the botton-right");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice: ");
                    int kindTri = input.nextInt();
                    switch (kindTri) {
                        case 1: {
                            System.out.println("Enter the height");
                            int h = input.nextInt();
                            for (int i = 1; i <= h; i++) {
                                System.out.println("*".repeat(i));
                            }
                        }
                        ;
                        break;

                        case 2: {
                            System.out.println("Enter the height");
                            int h = input.nextInt();
                            int k =0;
                            for (int i = 1; i <= h; i++) {
                                System.out.println(" ".repeat(h - i) + "*".repeat(2 * i - 1));
                            }
                        }
                        break;

                        case 3: {
                            System.out.println("Enter the height");
                            int h = input.nextInt();
                            for (int i = h; i >= 1; i--) {
                                System.out.println("*".repeat(i));
                            }
                        }
                        break;

                        case 4: {
                            System.out.println("Enter the height");
                            int h = input.nextInt();
                            for (int i = h; i >= 1; i--){
                                System.out.println(" ".repeat(h-i) + "*".repeat(i));
                            }
                        }
                        break;
                    }
                }
                case 3: {
                    System.out.println("Enter the height");
                    int h = input.nextInt();
                    int k =0;
                    for (int i = 1; i <= h; ++i, k = 0) {
                        for (int space = 1; space <= h - i; ++space) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                };
                break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
