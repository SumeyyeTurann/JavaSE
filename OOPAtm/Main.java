public class Main {
    public static void main(String[] args) {
        ATM atm =new ATM();
     
        Hesap hesap=new Hesap("Sümeyye Turan", "123456", 10000);
        Login login=new Login();
        login.login(hesap);
        hesap.Para_yatır(5000);
        hesap.Para_yatır(1500);
        hesap.Para_çekme(2000);
        
        
        System.out.println("Programdan çıkılıyor...");
        
        
}
    
    
}
