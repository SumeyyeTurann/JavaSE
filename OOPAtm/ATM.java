
import java.util.Scanner;

public class ATM {
    public void çalış(Hesap hesap){
        Login login =new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgeldiniz..");
        
        System.out.println("Kullanıcı girişi.. ");
        
        int giriş_hakkın=3;
        while (true) {            
            if(login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                System.out.println("Giriş başarısız..");
                giriş_hakkın--;
                System.out.println("Kalan giriş hakkınız: " + giriş_hakkın);
                
            }
            if(giriş_hakkın==0){
                System.out.println("Giriş hakkınız bitmiştir..");
                break;
            }
        }
        
        String işlemler="1. işlem: Bakiye sorgulama\n "
                        + "2. işlem: Para Yatırma\n"
                        + "3.işlem: Para Çekme\n"
                        +"Çıkmak için 'q' ya  basınız";
        System.out.println(işlemler);
        
        while (true) {
            if(işlemler=="q"){
                break;
            }
            else if(işlemler.equals(1)){
                System.out.println("Bakiyeniz: " + hesap.getbakiye());
            }
            else if(işlemler.equals(2)){
                System.out.println("Yatırmak istediğiniz tutat: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.Para_yatır(tutar);

            }
            else if(işlemler.equals(3)){
                System.out.println("Çekmek istediğiniz tutat: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.Para_çekme(tutar);
 
            }
            else {
                System.out.println("geçersiz işlem");
            }
        }
        
    }
    
    
}
