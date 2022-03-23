/*
 * NIM          : 13020200174 
 * Nama         : Ainur Ridha Surya
 * Hari/Tanggal : Rabu,9 Maret 2022
 * Waktu        : 12.00
 */
package Tugas2_SourceCode;
import java.util.Scanner;
/* Baca N, Print 1 s/d N dengan FOR */

public class PriFor {
    public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int i,N; 
Scanner masukan=new Scanner(System.in);
/* Program */
/* program */
System.out.print ("Baca N, print 1 s/d N "); 
System.out.print ("N = ");
N=masukan.nextInt();
for (i = 1; i <= N; i++){
System.out.println (i); };
System.out.println ("Akhir program \n"); 
}
}
