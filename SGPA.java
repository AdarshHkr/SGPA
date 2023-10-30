import java.util.Scanner;

public class SGPA {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number of Subjects:");
        int N = Sc.nextInt();
        float marks[];
        float Cr[];
        marks = new float[N];
        Cr = new float[N];
        float M[];
        M = new float[N];
        float SM[];
        SM = new float[N];
        float sc;
        sc = 0;
        float GM;
        GM = 0;
        for (int i = 0; i < N; i++) {

            System.out.printf("Enter the Subject %d Marks  : ", i + 1);
            for (int j = i; j < i + 1; j++) {
                marks[j] = Sc.nextFloat();
                if (marks[j] < 100 && marks[j] >= 90) {
                    M[j] = 10;
                } else if (marks[j] < 90 && marks[j] >= 80) {
                    M[j] = 9;
                } else if (marks[j] < 80 && marks[j] >= 70) {
                    M[j] = 8;
                } else if (marks[j] < 70 && marks[j] >= 60) {
                    M[j] = 7;
                } else if (marks[j] < 60 && marks[j] >= 50) {
                    M[j] = 6;
                } else if (marks[j] < 50 && marks[j] >= 45) {
                    M[j] = 5;
                } else if (marks[j] < 45 && marks[j] >= 40) {
                    M[j] = 4;
                } else if (marks[j] < 40 && marks[j] >= 0) {
                    M[j] = 0;
                } else {
                    System.out.println("ENTER A VALID MARKS!!!!!!");
                }
            }
            System.out.printf("Enter the Credit alloted to Subject %d : ", i + 1);
            for (int k = i; k < i + 1; k++) {
                Cr[k] = Sc.nextFloat();
                SM[k] = M[k] * Cr[k];
                GM = GM + SM[k];
                sc = sc + Cr[k];
            }
        }
        System.out.printf(
                "You have obtained an SGPA (according to 2018. scheme ,since 2022 scheme is not available) out of 10  =   %.1f",
                GM / sc);
    }
}
