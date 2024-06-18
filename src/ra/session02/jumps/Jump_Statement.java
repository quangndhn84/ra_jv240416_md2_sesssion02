package ra.session02.jumps;

public class Jump_Statement {
    public static void main(String[] args) {
        //break: thoát khỏi vòng lặp hoặc switch...case
        //continue: dừng vòng lặp tại đó và chuyển sang vòng lặp tiếp theo
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        int sum = sumTwoNumbers(10, 20);
        System.out.println("Tổng 2 số là: " + sum);
    }

    public static int sumTwoNumbers(int firstNumber, int secondNumber) {
        int total = firstNumber + secondNumber;
        return total;
    }
}
