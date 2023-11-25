package zAulas;

import javax.sound.midi.SysexMessage;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class LocalizaXEmMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número de linhas: ");
        int n = sc.nextInt();
        System.out.println("Insira o número de colunas: ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Numero a ser pesquisado: ");
        int l = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (l == mat[i][j]) {
                    System.out.println("Position: " + i + ", " + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    } if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    } if (j < m -1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    } if (i < n -1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
