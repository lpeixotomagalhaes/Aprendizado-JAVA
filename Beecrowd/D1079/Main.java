package D1079;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] vetor = new double[3];
        double[] resultado = new double[n];

        for(int i = 0; i < n; i++) {
            vetor[0] = sc.nextDouble();
            vetor[1]= sc.nextDouble();
            vetor[2] = sc.nextDouble();
            resultado[i] = ((vetor[0]*2)+(vetor[1]*3)+(vetor[2]*5))/10;
        }

        for (int i = 0;i < n;i++){
            System.out.printf("%.1f%n", resultado[i]);
        }


    }

}