package ra.session02.loops;

public class For_Statement {
    public static void main(String[] args) {
        //Sử dụng khi biết trước số lần lặp
        //In ra các số chẵn trong khoảng 1-10
        System.out.println("Các số chẵn trong khoảng 1-10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.println();
        //Đếm các số lẻ từ 100 - 1
        int cntOdd = 0;
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0) {
                cntOdd++;
            }
        }
        System.out.printf("Có %d số lẻ trong khoảng từ 100-1\n", cntOdd);
        //Sử dụng vòng for tìm điểm trung bình trong khoảng 0-10
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--) {

        }
        System.out.println("Điểm trung bình trong khoảng 0-10 là: " + i);
    }
}
