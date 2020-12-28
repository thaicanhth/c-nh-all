import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        int n;
        int SoLe = 0, SoChan = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        // A.length: trả về độ dài của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                SoChan++;
            } else {
                SoLe++;
            }
        }

        System.out.println(" số chẵn trong mảng = " + SoChan);
        System.out.println(" số lẻ trong mảng = " + SoLe);
    }
}


