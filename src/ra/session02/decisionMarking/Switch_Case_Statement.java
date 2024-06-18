package ra.session02.decisionMarking;

import java.util.Scanner;

public class Switch_Case_Statement {
    public static void main(String[] args) {
        //Nhập vào một số nguyên (0-9), phiêm âm số đó
        //B1: Nhập số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        //B2: Sử dụng switch...case phiên âm số
        switch (number) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            default:
                System.out.println("Chín");
        }
    }
}
