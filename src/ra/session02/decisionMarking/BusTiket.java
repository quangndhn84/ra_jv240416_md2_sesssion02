package ra.session02.decisionMarking;

import java.util.Scanner;

public class BusTiket {
    public static void main(String[] args) {
        /*
         * Input: age, TICKET_PRICE = 7000
         * Output: ticket
         * */
        //B1: Nhập tuổi người đi xe bus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tuổi của bạn:");
        int age = Integer.parseInt(scanner.nextLine());
        //B2: Khai báo hằng số TICKET_PRICE
        final float TICKET_PRICE = 7000;
        //B3: Sử dụng điều kiện if-else tính giá xe bus
        float ticket;
        if (age < 6 || age >= 60) {
            ticket = 0;
        } else if (age < 18) {
            ticket = 0.5F * TICKET_PRICE;
        } else {
            ticket = TICKET_PRICE;
        }
        //B4: In giá xe bus
        System.out.println("Giá vé xe bus: " + ticket + "VND");
    }
}
