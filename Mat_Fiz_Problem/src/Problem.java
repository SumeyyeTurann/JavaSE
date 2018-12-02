
import java.util.Scanner;

public class Problem {
    
    public static class Matematik{
        
        
        public static class Daire{
            public static void Dairenin_alanı(int yarıçap){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Dairenin yarıçap uzunluğunu giriniz: ");
                yarıçap=scanner.nextInt();
                System.out.println("Dairenin alanı: " + ((double)Math.PI*yarıçap*yarıçap));
            }
            
        }
        public static class Üçgen{
            public static void Üçgenin_alanı(int taban, int yükseklik){
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Üçgenin taban uzunluğunu giriniz: ");
                taban = scanner.nextInt();
                System.out.println("Üçgenin yüksekliğini giriniz: ");
                yükseklik = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Üçgenin alanı: " + (taban*yükseklik)/2);
                
            }
            public static void Üçgenin_çevresi(int kenar1, int kenar2, int kenar3){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Üçgenin 1. kenar uzunluğunu giriniz: ");
                kenar1=scanner.nextInt();
                System.out.println("Üçgenin 2. kenar uzunluğunu giriniz: ");
                kenar2=scanner.nextInt();
                System.out.println("Üçgenin 3. kenar uzunluğunu giriniz: ");
                kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Üçgenin çevresi: " + (kenar1+kenar2+kenar3) );
                
            }
        
        }
   
}
    public static class Fizik{
        public static void İç_çarpımı(Vektör vect1, Vektör vect2){
                
            int iççarpımı = vect1.getI()*vect2.getI() + vect1.getJ()*vect2.getJ()+ vect1.getK()*vect2.getK();
            System.out.println( vect1.getİsim()+"ile "+ vect2.getİsim() + "in iç çarpımı: "  + iççarpımı);
            }
        }
}
