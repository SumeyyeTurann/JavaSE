package inheritance2;

import java.util.Scanner;

public class Ana_sınıf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String işlemler= "İşlem seçiniz \n"
                         + "1. Yazılımcı İşlemleri\n "
                         + "2. Yönetici İşlemleri\n "
                         + "3. Çalışan İşlemleri\n "
                         + "Çıkış için: q ya basınız";
    
        System.out.println(işlemler);
        System.out.println("******************************************");
    
        while (true) {            
            System.out.print("Yapacağınız İşlemi Seçiniz: ");
            String işlem=scanner.nextLine();
            
            if(işlem.equals("q")){
                System.out.println("Programdan çıkılıyor..");
                break;
                
            }
            else if(işlem.equals("1")){
                Yazılımcı yazılım = new Yazılımcı("Sümeyye","Turan", 16541516, "C#, Java");
                String yazılımcı_işlem = "1. Format At \n"
                                         + "2. Yazılımcı Bilgilerini Görüntüle \n"
                                         + "Çıkış için q ya basınız..";
                System.out.println(yazılımcı_işlem);
                System.out.println("******************************************");
                
                while (true) {
                    System.out.print("İşlemi seçiniz: ");
                    String y_işlem=scanner.nextLine();
                    
                    if(y_işlem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor..");
                        System.out.println("******************************************");
                        break;
                        
                    }
                    else if(y_işlem.equals("1")){
                       
                        System.out.print("İşletim Sistemi: ");
                        String işletim_sistemi =scanner.nextLine();
                        yazılım.Format_At(işletim_sistemi);
                    }
                    else if (y_işlem.equals("2")){
                        yazılım.Çalışan_bilgileri();
                    }
                    else{
                        System.out.println("Girdiğiniz yazılımcı işlemi geçersizdir..");
                        System.out.println("******************************************");
                    }
                }
                       
                
            }
            else if(işlem.equals("2")){
                Yönetici yönet = new Yönetici("Sümeyye", "Turan", 16541516, 20);
                
                String yönetici_işlem = "1. Çalışan Bilgileri Görüntüle\n"
                                        +"2. Zam Yap \n"
                                       + "Çıkış için q ya basınız..";
                System.out.println(yönetici_işlem);
                System.out.println("******************************************");
                
                while (true) {
                    System.out.print("İşlemi seçiniz: ");
                    String ynt_işlem=scanner.nextLine();
                    if(ynt_işlem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        System.out.println("******************************************");
                        break;
                    }
                    else if(ynt_işlem.equals("1")){
                        yönet.Çalışan_bilgileri();
                    }
                    else if(ynt_işlem.equals("2")){
                        System.out.println("Yöneticinin ne kadar zamn yapmasını istersiniz");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        yönet.zam_yap(miktar);
                    }
                    else{
                        System.out.println("Girdiğiniz işlem geçersizdir..");
                        System.out.println("******************************************");
                    
                    }
                }   
            }        
            // 3. işlemi eklemem lazıım
            else if(işlem.equals("3")){
                Çalışan çalış = new Çalışan("Sümeyye", "Turan", 16541516);
                String çalışan = "1. Çalışan bilgilerini görüntüle\n"
                                + "Çıkış için q ya basınız";
                System.out.println(çalışan);
                System.out.println("******************************************");
                
                        
                while (true) {
                    System.out.print("Çalışan işleminizi seçiniz: ");
                    String çlş_işlem=scanner.nextLine();
                    
                    if(çlş_işlem.equals("1")){
                        System.out.println("Çalışan bilgileri");
                        çalış.Çalışan_bilgileri();
                    }
                    else if(çlş_işlem.equals("q")){
                        System.out.println("Çalışan işlemlerinden çıkılıyor");
                        System.out.println("******************************************");
                        break;
                    }
                    else{
                        System.out.println("Girdiğiniz işlem geçersizdir..");
                        System.out.println("******************************************");
                    }
                    
                }
                
            }
            else{
                System.out.println("Geçersiz İşlem..");
            }
                   
        }
    }
}
 
    
    
          

