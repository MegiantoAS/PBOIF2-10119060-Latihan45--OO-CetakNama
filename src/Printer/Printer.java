/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printer;

/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Cetak Nama
 */
public class Printer {
    public int jmlcetak;
    public String nama;
    
    public int getJmlCetak(){
        return jmlcetak;
    }
    
    public void setJmlCetak(int jmlcetak){
        this.jmlcetak = jmlcetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama Anda : "+getNama());
    }
    public void cetak(int JmlCetak, String nama){
        System.out.println("HasilCetak: ");
        System.out.println("");
        for(int i = 1; i <= jmlcetak; i++){
            System.out.println(i+". "+nama);
        }
    }
    
}
