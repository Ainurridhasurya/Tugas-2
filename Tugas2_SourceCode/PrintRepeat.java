/*
 * NIM          : 13020200174 
 * Nama         : Ainur Ridha Surya
 * Hari/Tanggal : Rabu,9 Maret 2022
 * Waktu        : 12.00
 */
package Tugas2_SourceCode;
import java.util.Scanner;

public class PrintRepeat {
    public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int N;
int i;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Nilai N >0 = "); 
/* Inisialisasi */
N = masukan.nextInt();
i = 1; 
/* First Elmt */
System.out.print ("Print i dengan REPEAT: \n"); 
do{
System.out.print (i+"\n"); /* Proses */
i++; /* Next Elmt */
}
while (i <= N); /* Kondisi pengulangan */
}

}
