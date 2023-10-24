package JOBSHEET_9;
import java.util.Scanner;

public class ArrayRataNilai13_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[5];
        double total = 0;
        double rata2;
        double rata2_2;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        int lulus = 0;
        int tidakLulus = 0;
        int jmlhMhs;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlhMhs = sc.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " +(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs [i];
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs [i];
                lulus++;
            }else {
                totalTdkLulus += nilaiMhs [i];
                tidakLulus++;
            }
        }
        
        rata2 = totalLulus/lulus;
        rata2_2 = totalTdkLulus/tidakLulus;
        System.out.println("Rata-rata nilai yang lulus : " + rata2);
        System.out.println("Rata-rata nilai yang tidak lulus : " + rata2_2);
    }
}