
import java.util.Scanner;

public class Armstrong_sayı {
    //armstrong sayı 1234=1^4 + 2^4 + 3^4 + 4^4 eşit olması durumudur.
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Sayı giriniz: ");
        int sayi=scanner.nextInt();
        
        System.out.println("Girdiğiniz sayının basamak değerini giriniz: ");
        int basamak=scanner.nextInt();
        
        int geçici=sayi;
        int toplam =0;
        
        do {            
            int basamak_değeri=geçici%10;
            geçici/=10;
            
            toplam+=Math.pow(basamak_değeri, basamak);
        } while (geçici>0);
        if(sayi==toplam){
            System.out.println("Bu girilen sayı armstrong sayısıdır..");
        }
        else{
            System.out.println("Bu girilen sayı bir armstrong sayısı değildir..");
        }
}
}
