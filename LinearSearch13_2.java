package JOBSHEET_9;
import java.util.Scanner;

public class LinearSearch13_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nilaiKey = new int[10];
        int hasil = 0;
        int key = 0;
        int jmlhArray = 0;

        System.out.print("Masukkan jumlah elemen array : ");
        jmlhArray = sc.nextInt();

        for (int i = 0; i < jmlhArray; i++) {
            System.out.print("Masukkan elemen array ke- " +(i)+" : ");
            nilaiKey[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();
        for (int i = 0; i < jmlhArray; i++) {
            if (nilaiKey[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke- " + i);
                break;
            } else {
                System.out.println("Key yang anda cari tidak ada");
            }
            break;
        } 
    }
}
