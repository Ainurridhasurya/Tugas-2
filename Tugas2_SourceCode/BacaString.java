/*
 * NIM          : 13020200174 
 * Nama         : Ainur Ridha Surya
 * Hari/Tanggal : Rabu,9 Maret 2022
 * Waktu        : 12.00
 */
package Tugas2_SourceCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;


public class BacaString {
 public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
/* Kamus */ 
String str; 
BufferedReader datAIn = new BufferedReader(new 
InputStreamReader(System.in));
/* Program */
System.out.print ("\nBaca string dan Integer: \n"); 
System.out.print("masukkan sebuah string: "); 
str= datAIn.readLine();
System.out.print ("String yang dibaca : "+ str);
}   
}
