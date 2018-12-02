package beden_kitle_indeksi;

import java.util.Scanner;

public class Beden_Kitle_İndeksi {
    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in); // ctrl + shift + i ile scannerı programa dahil ettik. Kullanıcıdan veri almak için..
        
        System.out.print("kilonuz :");
        int kilo = scanner.nextInt();
               
        System.out.print("boyunuz (örnek=1,72) :"); // . ile değer girilince hata veriyor!
        double boy = scanner.nextDouble();
        
        double kitle_indeksi = kilo/(boy*boy);
        System.out.println("kitle indeksiniz :" + kitle_indeksi);
    }
    
}
