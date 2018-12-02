
import java.util.LinkedList;
import java.util.ListIterator;


public class Test {
    
    public static void Listeyi_bastır(LinkedList<String> günlük_plan){
        ListIterator<String> ıterator =günlük_plan.listIterator();
        
        while(ıterator.hasNext()){
            System.out.println(ıterator.next());
        }
        
    }
    public static void sıralı_ekle(LinkedList<String> günlük_plan, String yeni){
        ListIterator<String> ıterator =günlük_plan.listIterator();
        
        while(ıterator.hasNext()){
            int karşılaştır=ıterator.next().compareTo(yeni);
            
            if(karşılaştır==0){
                //iki değer eşit
                System.out.println("Listenizde bu eleman zaten var");
                
            }
            else if(karşılaştır<0){
                //yeni değer büyüktür
            }
            else if(karşılaştır>0){
                ıterator.previous();
                ıterator.add(yeni);
                return;
            }
        }
        ıterator.add(yeni);
        
    }
    public static void main(String[] args) {
        LinkedList<String> günlük_plan = new LinkedList<String>();
        
        sıralı_ekle(günlük_plan, "Kahvaltı Yap");
        sıralı_ekle(günlük_plan,"Markete git");
        sıralı_ekle(günlük_plan,"Kütüphaneye git");
        sıralı_ekle(günlük_plan, "Java çalış");
        sıralı_ekle(günlük_plan, "Öğle yemeği ye");
        sıralı_ekle(günlük_plan, "Kahve iç");
        sıralı_ekle(günlük_plan, "Eve dön");
        
        
        Listeyi_bastır(günlük_plan);
    }
}
