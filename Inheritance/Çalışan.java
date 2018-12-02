package inheritance2;


public class Çalışan {
    private String ad;
    private String soyad;
    private int id;

    public Çalışan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

//    Çalışan() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void Çalışan_bilgileri(){
        System.out.println("İsim: " + ad);
        System.out.println("Soyisim: " +soyad);
        System.out.println("ID: " + id );
 
    }
}
