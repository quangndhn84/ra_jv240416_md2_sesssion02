package ra.session02.loops;

import java.util.Scanner;

public class While_Statement {
    public static void main(String[] args) {
        //Sử dụng khi chưa biết trước số lần lặp
        //Nhập các số từ bàn phím, kết thúc khi nhập 0. Tính tổng các số vừa nhập
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int totalNumbers = 0;
        while (number != 0) {
            System.out.println("Nhập vào 1 số nguyên:");
            number = Integer.parseInt(scanner.nextLine());
            totalNumbers += number;
        }
        System.out.println("Tổng các số vừa nhập là: " + totalNumbers);
    }
}
