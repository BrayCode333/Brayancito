import java.util.Scanner;

public class Segui0{
    public static void main(String[] args){
    
    double x1;
    double y1;
    double x2;
    double y2;
    Scanner lector = new Scanner(System.in);
    System.out.println("Dame la cordenada de x1");
    x1 = lector.nextDouble();
    System.out.println("Dame la coordenada de y1");
    y1 = lector.nextDouble();
    System.out.println("Dame la coordenada de x2");
    x2 = lector.nextDouble();
    System.out.println("Dame la coordenada de y2");
    y2 = lector.nextDouble();
    imprima(x1,y1,x2,y2);




    
    
    }


    public static String medio(double x1, double y1, double x2, double y2){
    double m=(x1+x2)/2.0;
    double p=(y1+y2)/2.0;
    
    return "("+m+","+p+")";

    }

    public static void imprima(double x1, double y1, double x2, double y2){
        String boludo=medio(x1, y1, x2, y2);
        System.out.println("Donde se tienen que encontrar martin y Ricardo es " + boludo);
    }

    
}
