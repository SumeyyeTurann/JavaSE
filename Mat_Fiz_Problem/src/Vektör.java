
import java.util.Scanner;

public class Vektör {
    private String İsim;
    private int i;
    private int j;
    private int k;
    
    public Vektör(String İsim){
        System.out.println(this.İsim);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(İsim + "vektörün i, j, k değerlerini giriniz: ");
        System.out.println("Vektörün ismi: " );
        this.İsim=scanner.nextLine();
        System.out.println("Vektörün i değeri: " );
        this.i=scanner.nextInt();
        System.out.println("Vektörün j değeri: " );
        this.j=scanner.nextInt();
        System.out.println("Vektörün k değeri: " );
        this.k=scanner.nextInt();
        scanner.nextLine();
    }

    public String getİsim() {
        return İsim;
    }

    public void setİsim(String İsim) {
        this.İsim = İsim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
   
    
    
}
