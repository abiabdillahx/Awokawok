# Case Faktor bilangan X

## Constrain
### [Link soal](https://www.hackerrank.com/contests/latihan-array-tif-d/challenges/faktor-bilangan-x-2)

![image](https://github.com/user-attachments/assets/0073561e-c09e-4b03-bba2-e4f7b7aed4c0)

</br>

## Penyelesaian

```java
import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jml = 0;
        int[] faktor = new int[n];

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                faktor[jml] = i;
                jml++;
            }
        }
        System.out.println(jml);
        for (int j = jml - 1; j >= 0; j--) {
            System.out.print(faktor[j] + " ");
        }
        sc.close();
    }
}

```
