public class Hesap {
    
    private String kullanıcı_adı;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcı_adı, String parola, int bakiye) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getkullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setkullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getparola() {
        return parola;
    }

    public void setparola(String parola) {
        this.parola = parola;
    }

    public int getbakiye() {
        return bakiye;
    }

    public void setbakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void Para_yatır(int para){
        System.out.println("Yatırmak istedğiniz tutar: " + para);
        bakiye+=para;
        System.out.println("Toplam bakiyeniz " + bakiye);
        
    }
    
    public void Para_çekme(int para){
        if(bakiye-para<0){
            System.out.println("Yetersiz bakiye, Bakiyeniz  " + bakiye + "ile sınırlıdır. Daha fazlasını çekemezsiniz..");
        }
        if(para>1500){
            System.out.println("Bir günde 1500 tl üzerinde para çekemezsiniz..");
            
        }
        else{
            bakiye-=para;
            System.out.println("Yeni bakiyeniz: " + bakiye);
                    
        }
    }
    public String değerleri_görüntüle(String kullanıcı_adı, String parola, int bakiye){
        this.kullanıcı_adı=kullanıcı_adı;
        this.parola=parola;
        this.bakiye=bakiye;
        
        return değerleri_görüntüle(kullanıcı_adı, parola, bakiye);
    }
}
