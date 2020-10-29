import java.util.Scanner;

public class temps {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
     
        int s, dias, horas, min, seg, n, n1;
        
        System.out.println("Introduir segons:");
        s = keyboard.nextInt();
        
        dias = s/86400;
        n = s%86400;
        
        horas = n/3600;
        n1 = n%3600;
        
        min = n1/60;
       
        seg = n1%60;
  
        System.out.println(dias + " dies " + horas + 
                " hores " + min + " minuts " + seg + " segons");
    }
    
}
