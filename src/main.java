import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println(" write the N sum numbers");
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            N = scanner.nextInt();
            System.out.println(N);
        }while (N>=1);
        System.out.println("finish");
    }
}
