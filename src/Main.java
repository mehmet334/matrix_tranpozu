import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix boyutludur satır sayisi: ");
        int satır = scanner.nextInt();
        System.out.println("Matrix boyutludur kolon sayisi: ");
        int kolon= scanner.nextInt();

        int[][] matrix = new int[satır][kolon];

        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < kolon; j++) {
                System.out.println("[" +i +","+j+"] Elemanı giriniz : ");
                int sayi= scanner.nextInt();
                matrix[i][j]= sayi;
                sayi=0;
            }
        }
        System.out.println("Girdiğiniz matrix....");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < kolon; j++) {
                System.out.print(matrix[i][j]+ " ,");
            }
            System.out.println("");
        }
        System.out.println("Matrix'in transpozu.....");

        int[][] matrixtranspoz =new int[kolon][satır];
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < kolon; j++) {
                matrixtranspoz[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < kolon; i++) {
            for (int j = 0; j < satır; j++) {
                System.out.print(matrixtranspoz[i][j] + ",");
            }
            System.out.println("");
        }
    }
}