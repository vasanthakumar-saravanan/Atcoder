import java.util.Scanner;

public class ABC_463_Task_B{                                        //https://atcoder.jp/contests/abc463/tasks/abc463_b
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char X = sc.next().charAt(0);

        int index = X - 'A';  

        boolean found = false;

        for (int i = 0; i < N; i++) {
            String seats = sc.next();

            if (seats.charAt(index) == 'o') {
                found = true;
            }
        }

        if (found)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}