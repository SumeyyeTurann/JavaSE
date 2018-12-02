
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
         Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        acilservis.offer(new Hasta("Murat Bey", "Yanık"));
        acilservis.offer(new Hasta("Hasan Bey", "Apandisit"));
        acilservis.offer(new Hasta("Elif Hanım", "Baş Ağrısı"));
        acilservis.offer(new Hasta("Gül Hanım", "Yanık"));
        acilservis.offer(new Hasta("Emre Bey", "Yanık"));
        acilservis.offer(new Hasta("Aynur Hanım", "Apandisit"));
        acilservis.offer(new Hasta("Kenan Bey", "Yanık"));
        acilservis.offer(new Hasta("Ayşe Hanım", "Baş Ağrısı"));
                
        int i=1;
        
        while(acilservis.isEmpty()!=true){
            System.out.println("******************************");
            System.out.println(i + ". sırada: ");
            System.out.println(acilservis.poll());
            System.out.println("******************************");
            
        }
    }
}
