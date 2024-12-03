# Case Transpose Matriks 1

## Constrain
### [Link soal](https://www.hackerrank.com/contests/latihan-array-1606394729/challenges/transpose-matriks-1)
![image](https://github.com/user-attachments/assets/c8cf4241-3fca-4b00-9970-32fb5b0d1169)

</br>

## Penyelesaian


```java
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membaca ukuran matriks
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        // Membuat matriks dan membaca input
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Mencetak hasil transpose
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j]);
                if (i < rows - 1) {
                    System.out.print(" "); // Menambahkan spasi antar elemen
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris hasil transpose
        }
        
        sc.close();
    }
}
```
