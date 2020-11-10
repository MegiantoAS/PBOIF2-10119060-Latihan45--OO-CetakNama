/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan45.oo.cetaknama;
import Printer.Printer;
import java.util.Scanner;
/**
 *
@author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Cetak Nama
 */
public class PBOIF210119060Latihan45OOCetakNama {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Printer objPrinter = new Printer();
        
        System.out.println("======Aplikasi Pncetak Nama=====");
        System.out.print("Masukan nama Anda : ");
        objPrinter.setNama(input.nextLine());
        System.out.print("Mau Cetak nama Berapa kali? : ");
        objPrinter.setJmlCetak(input.nextInt());
        
        objPrinter.cetak(objPrinter.getNama());
        objPrinter.cetak(objPrinter.getJmlCetak(),objPrinter.getNama());
        
        
    }
    
}
