package ra.session02.decisionMarking;

import java.util.Scanner;

public class If_Else_Statement {
    public static void main(String[] args) {
        //Nhập vào 1 số từ bàn phím, kiểm tra số đó là số chẵn hay lẻ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.printf("%d là số chẵn\n", number);
        } else {
            System.out.printf("%d là số lẻ\n", number);
        }
        //In ra số dư trong phép chia 3
        if (number % 3 == 0) {
            System.out.printf("%d chia hết cho 3\n", number);
        } else if (number % 3 == 1) {
            System.out.printf("%d chia 3 dư 1\n", number);
        } else {
            System.out.printf("%d chia 3 dư 2\n", number);
        }
        //In ra số dư trong phép chia 5: 5 trường hợp - 5 mệnh đề: 1 if - 3 else-if - 1 else
//        String result = (number%3==0)?"Chia hết cho 3":((number%3==1)?"Chia 3 dư 1":"Chia 3 dư 2");
//        System.out.println(result);
    }
}
