
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Programına hoşgeldiniz.. ");
        String işlemler="İşlemler...\n"
                       +"1. Matematik işlemleri\n"
                       +"2. Fizik işlemleri\n"
                       +"Çıkış için '0' a basınız...";
        
        
        System.out.println(işlemler);
        System.out.println("**************************1");
        
        while (true) {
            System.out.println("İşlem seçiniz.. ");
            int işlem = scanner.nextInt();
            scanner.nextLine();
            
            if(işlem==1){
                String Mat_işlemleri="Matematik alanındaki işlemler..\n"
                                    +"1. Daire hesaplamaları\n"
                                    +"2.Üçgen hesaplamaları\n"
                                    +"Çıkış için '0' a basınız...";
                System.out.println(Mat_işlemleri);
                
                System.out.println("Yapacağınız işlemi seçiniz..");
                int m_işlem = scanner.nextInt();
                scanner.nextLine();
                
                if(m_işlem==1){
                    String daire_işlem="Daire alanındaki işlemler..\n"
                            + "1. Daire alan hesapla\n"
                            +"Çıkış için '0' a basınız..";
                    System.out.println(daire_işlem);
                    
                    System.out.println("Daire işlemini seçiniz..");
                    int d_işlem=scanner.nextInt();
                    if(d_işlem==1){
                        // Problem.Matematik.Daire alan = new Problem.Matematik.Daire();
//                        System.out.println("Dairenin yarıçapını giriniz:");
//                        int yarıçap = scanner.nextInt();
//                        scanner.nextLine();
                        
                        Problem.Matematik.Daire.Dairenin_alanı(0);
                                
                    }
                    
                    else if(d_işlem==0){
                        System.out.println("Programdan çıkılıyor...");
                        break;
                    }
                    else{
                        System.out.println("Lütfen geçerli bir işlem giriniz...");
                    }
                }
                else if(m_işlem==2){
                    String üçgen_işlem="Üçgen alanındaki hesaplamalar..\n "
                                    +"1. Üçgenin alanı\n"
                                    +"2. Üçgenin çevresi\n"
                                    +"Çıkış için '0' a basınız..";
                    System.out.println(üçgen_işlem);
                    
                    System.out.println("Üçgen üzerinde yapacağınız işlemi seçiniz..");
                    int ü_işlem =scanner.nextInt();
                    if(ü_işlem==1){
                        Problem.Matematik.Üçgen.Üçgenin_alanı(0, 0);
                    }
                    else if (ü_işlem==2){
                        Problem.Matematik.Üçgen.Üçgenin_çevresi(0, 0, 0);
                    }
                    else if(ü_işlem==0){
                        System.out.println("Programdan çıkılıyor..");
                        break;
                    }
                    else{
                        System.out.println("Lütfen geçerli bir işlem giriniz...");
                    }
                }
                else if(m_işlem==0){
                    System.out.println("Programdan çıkılıyor...");
                    break;
                }
                else{
                        System.out.println("Lütfen geçerli bir işlem giriniz...");
                }
                
            }
            
            else if(işlem==2){
                String Fizik_işlemleri="Fizik alanındaki işlemler..\n"
                                        +"1. İç çarpım \n"
                                        +"Çıkış için '0' a basınız..";
                System.out.println(Fizik_işlemleri);
                
                System.out.println("Yapacağınız işlemi seçiniz..");
                int f_işlem=scanner.nextInt();
                scanner.nextLine();
                
                if(f_işlem==1){
                    
                    Vektör vect1 = new Vektör("Vektör1");
                    Vektör vect2 = new Vektör("Vektör2");
                    Problem.Fizik.İç_çarpımı(vect1,vect2);
                    
                    
                }
                else if(f_işlem==0){
                    System.out.println("Programdan çıkılıyor...");
                    break;
                }
                else{
                        System.out.println("Lütfen geçerli bir işlem giriniz...");
                }
            }
            else if(işlem==0){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            
            else{
                System.out.println("Lütfen geçerli bir işlem giriniz...");
            }
            
        }
}
}
