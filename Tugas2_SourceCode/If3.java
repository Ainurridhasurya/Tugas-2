/*
 * NIM          : 13020200174 
 * Nama         : Ainur Ridha Surya
 * Hari/Tanggal : Rabu,9 Maret 2022
 * Waktu        : 12.00
 */
package Tugas2_SourceCode;
import java.util.Scanner;
/* contoh pemakaian IF tiga kasus */ /* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */
/* 'Nilai Nol , nilai a', jika a = 0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

public class If3 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int a;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Contoh IF tiga kasus \n"); 
System.out.print ("Ketikkan suatu nilai integer :"); 
a=masukan.nextInt();
if (a > 0){
System.out.println ("Nilai a positif "+ a);
}else if (a == 0){
System.out.println ("Nilai Nol "+ a);
}else /* a > 0 */ {
System.out.println ("Nilai a negatif "+ a);
}
}

}