/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperulanganwhile;
import java.util.Scanner;
public class TugasPerulanganWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, bilangan;
        System.out.println("Program Untuk Menampilkan Bilangan Ganjil");
        System.out.print("Masukkan Nilai n = ");
        n = s.nextInt();
        System.out.println("Deret Bilangan Ganjilnya = ");
        bilangan = 1;
        while (bilangan <= n){
            System.out.print(bilangan+" ");
            bilangan += 2;
        }
    }
    
}
