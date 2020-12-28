import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        int A[] = new int[n];
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) ;
        // giá trị chia hết cho5 không chia hết cho 6
        System.out.println("Các phần tử chia hết cho 5 không chia hết cho 6: ");
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0)
            if (A[i] % 6!=0)
            {
                System.out.print(A[i] + "\t");
        // đếm số phần tử trong mảng A có giá trị lẻ
                do {
                    System.out.println("Nhập vào số phần tử của mảng: ");
                    n = scanner.nextInt();
                } while (n <= 0);
                int le[] = new int[n];  // mảng chứa các phần tử là số lẻ
                System.out.println("Nhập các phần tử cho mảng: ");
                for (int j = 0; j < n; j++) {
                    System.out.print("Nhập phần tử thứ " + i + ": ");
                    A[i] = scanner.nextInt();
                    for (int k = 0; k < n; k++){
                        if (A[i] % 2 == 0){
                            le[i] = A[i];
                            i++;
                        }
                    }
                    System.out.println("\nCác phần tử của mảng le là: ");
                    for (int k = 0; k < k; k++) {
                        System.out.print(le[k] + "\t");{
        //
                        }
                    }
                }
              }
            }
        }
    }

