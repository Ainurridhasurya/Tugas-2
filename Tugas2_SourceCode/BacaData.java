/*
* NIM           : 13020200174
* Nama          : Ainur Ridha Surya
* Hari/Tanggal  : Rabu / 9 Maret 2022
* Waktu         : 12.00
*/
package Tugas2_SourceCode;
import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int a;
Scanner masukan;
/* Program */
System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
masukan = new Scanner(System.in);
a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ; 
Apa akibatnya ?*/
System.out.print ("Nilai yang dibaca : "+ a);
}
}
