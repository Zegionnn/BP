/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperulangandowhile;
import java.util.Scanner;
public class TugasPerulanganDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Untuk Menampilkan Bilangan Ganjil");
        System.out.print("Masukkan Nilai n = ");
        int n, bilangan;
        n = s.nextInt();
        System.out.println("Deret Bilangan Ganjilnya = ");
        bilangan = 1;
        do{
           System.out.print(bilangan+" ");
           bilangan += 2;
        }while(bilangan <= n);
    }
}
