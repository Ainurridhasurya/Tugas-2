/*
* NIM           : 13020200174
* Nama          : Ainur Ridha Surya
* Hari/Tanggal  : Rabu / 9 Maret 2022
* Waktu         : 12.00
*/
package Tugas2_SourceCode;

public class Oper4 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
/* KAMUS */
int i = 0; /* perhatikan int i,j=0 bukan seperti ini */
int j = 0;
char c = 8; char d = 10;
int e = (((int)c > (int)d) ? c: d); 
int k = ((i>j) ? i: j);
/* ALGORITMA */
System.out.print ("Nilai e = "+ e); 
System.out.print ("\nNilai k = "+ k); 
i = 2;
j = 3;
k = ((i++>j++) ? i: j) ;
System.out.print ("\nNilai k = "+ k); 
}
}
