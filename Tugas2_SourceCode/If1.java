/*
 * NIM          : 13020200174 
 * Nama         : Ainur Ridha Surya
 * Hari/Tanggal : Rabu,9 Maret 2022
 * Waktu        : 12.00
 */
package Tugas2_SourceCode;
import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
/* Kamus */ 
Scanner masukan=new Scanner(System.in);
int a;
/* Program */
System.out.print ("Contoh IF satu kasus \n"); 
System.out.print ("Ketikkan suatu nilai integer : "); 
a = masukan.nextInt();
if (a >= 0)
System.out.print ("\nNilai a positif "+ a); 
}
}
