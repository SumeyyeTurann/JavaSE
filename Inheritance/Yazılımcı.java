package inheritance2;


public class Yazılımcı extends Çalışan {
    private String Bildiği_diller;
    public Yazılımcı(String ad, String soyad, int id, String Bildiği_diller) {
        super(ad, soyad, id);
        this.Bildiği_diller=Bildiği_diller;
    }
    public void Format_At(String İşletim_Sistemi){
        System.out.println(getAd()+ " " + İşletim_Sistemi + " işletim sistemini kuruyor..");
    }

    @Override
    public void Çalışan_bilgileri() {
        super.Çalışan_bilgileri(); 
        System.out.println("Yazılımcını bildiği diller: " + this.Bildiği_diller);
        
    }
    
    
}
