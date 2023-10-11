/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperulanganfor;
import java.util.Scanner;
public class TugasPerulanganFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Untuk Menampilkan Bilangan Ganjil");
        System.out.print("Masukkan Nilai n = ");
        int n = s.nextInt();
        System.out.println("Deret Bilangan Ganjilnya = ");
        for (int Bilangan = 1; Bilangan <= n; Bilangan += 2){
            System.out.print(Bilangan+" ");
        }
    }
    
}
