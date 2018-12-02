
import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        String Kullanıcı_adı;
        String Parola;
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz: ");
        Kullanıcı_adı=scanner.nextLine();
        System.out.println("Lütfen parolanızı giriniz: ");
        Parola=scanner.nextLine();
        
        
        
        if(hesap.getkullanıcı_adı().equals(Kullanıcı_adı) && hesap.getparola().equals(Parola)){
            
            return true;
        }
        else{
            return false;
        }
    }

    
}
