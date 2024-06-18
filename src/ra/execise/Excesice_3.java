package ra.execise;

import java.util.Scanner;

public class Excesice_3 {
    public static void main(String[] args) {
        /*
         * Input: edge
         * Ouput: Perimeter, Area
         * Process:
         *   - B1: Nhập dữ liệu cạnh hình vuông
         *   - B2: tính chu vi và diện tích
         *   - B3: In chu vi và diện tính ra console
         * */
        //1. Nhập dữ liệu cạnh hình vuông
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh hình vuông:");
        float edge = Float.parseFloat(scanner.nextLine());
        //2. Tính chu vi và diện tích
        float perimeter = edge * 4;
//        float area = edge*edge;
        float area = (float) Math.pow(edge, 2);
        //3. In chu vi và diện tích
        System.out.printf("Chu vi: %f - Diện tích: %f\n", perimeter, area);
    }
}
