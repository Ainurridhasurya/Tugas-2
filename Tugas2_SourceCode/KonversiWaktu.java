/*
 * NIM          : 13020200174 
 * Nama         : Ainur Ridha Surya
 * Hari/Tanggal : Rabu,9 Maret 2022
 * Waktu        : 12.00
 */
package Tugas2_SourceCode;
import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        int TD, DS, TM, MS,TJ, JS;
         /*TD(TotalDetik), DS(DetikSekarang), 
           TM(TotalMenit), MS(MenitSekarang), 
           TJ(TotalJam), JS(JamSekarang)*/
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total detik : ");
        TD = input.nextInt();
        
        DS     = TD%60;
        TM     = TD/60;
        MS     = TM%60;
        TJ     = TM/60;
        JS     = TJ%24;
        
        System.out.println("Konversi dari : "+ TD +" detik, Adalah : ");
        System.out.println(TJ+" jam, "+ MS +" menit, "+ DS+" detik");
    }
}
