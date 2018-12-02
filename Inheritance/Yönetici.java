package inheritance2;


public class Yönetici extends Çalışan{
    private int sorumlu_kişi;

    public Yönetici(String ad, String soyad, int id, int sorumlu_kişi) {
        super(ad, soyad, id);
        this.sorumlu_kişi=sorumlu_kişi;
    }
    public void Çalışan_bilgileri(){
        super.Çalışan_bilgileri();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kişi);
        this.sorumlu_kişi=sorumlu_kişi;
        
    }
    public void zam_yap(int miktar){
        System.out.println(getAd() + " çalışanlara " + miktar + "tl zam yapıyor..");
        
    }
    
}
