import java.util.Scanner;

public class vehinh {
    public static void main(String[] args) {
        int chon = -1;
        Scanner sc = new Scanner(System.in);
        while (chon != 0) {
            System.out.println("menu");
            System.out.println("1.HCN");
            System.out.println("2.tam giác");
            System.out.println("3.tam giác ngc");
            System.out.println("4.tam giác cân");
            System.out.println("0.exit");
            System.out.println("nhập số bạn chọn: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    int hei = 3;
                    int wigh = 6;
                    for (int height = 0; height <= hei; height++) {
                        for (int wight = 0; wight <= wigh; wight++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int a = 7; a >= 1; a--) {
                        for (int b = 1; b <= a; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int x = 0; x <= 4; x++) {
                        for (int y = 3; y >= x; y--) {
                            System.out.print(" ");
                        }
                        for (int z = 0; z < 9; z += 2) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choise!");
            }
        }
    }
}
