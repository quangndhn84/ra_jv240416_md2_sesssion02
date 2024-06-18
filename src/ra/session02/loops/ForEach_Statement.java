package ra.session02.loops;

public class ForEach_Statement {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 8, 4, 9, 10};
        //In ra các số chẵn trong mảng numbers
        System.out.println("Các số chẵn trong mảng numbers:");
        for (int element : numbers) {
            if (element % 2 == 0) {
                System.out.printf("%d\t", element);
            }
        }
        System.out.println();
    }
}
