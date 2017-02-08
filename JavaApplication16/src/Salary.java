import java.util.Scanner;
public class Salary {
    public static void main(String[]args){
        Scanner in= new Scanner (System.in);
        
        System.out.println("Salario por hora:");
        double pagohora= in.nextDouble();
        System.out.println("Horas regulares trabajadas a la semana:");
        double horasr=in.nextDouble();
        System.out.println("Horas extras trabajadas a la semana");
        double extras=in.nextDouble();
        
        System.out.println("Su salario semanal es: "+extra(pagohora, horasr, extras));
    }
     public static Double extra(double a, double b, double c){
        return (b*a)+(c*(a*1.5));
     }
}
