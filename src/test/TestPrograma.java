package test;

import dominio.Programa;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import java.util.InputMismatchException;

public class TestPrograma {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        Programa[] coordenadas = new Programa[0];
        System.out.println("MOVIMIENTOS DE UN PUNTO EN EL PLANO\n");

        System.out.println("INGRESE EL NUMERO DE MOVIMIENTOS");
        int n = datos.nextInt();
        double suma;
        for (int i = 0; i < n; i++) {

            int valorDado = (int) Math.floor(Math.random() * 3);

            if (valorDado == 0) {
                System.out.println("EL PROGRAMA DECIDIO MOVERSE A LA IZQUIERDA DEL PLANO");
                izquierda(coordenadas);
                
            }
            if (valorDado == 1) {

                System.out.println("EL PROGRAMA DECIDIO MOVERSE A LA DERECHA DEL PLANO");
                derecha(coordenadas);

            }
            if (valorDado == 2) {
                System.out.println("EL PROGRAMA DECIDIO MOVERSE A LA ARRIBA DEL PLANO");
                arriba(coordenadas);

            }
            if (valorDado == 3) {
                System.out.println("EL PROGRAMA DECIDIO MOVERSE A LA ABAJO DEL PLANO");
                abajo(coordenadas);
            }

        }
    }
 
    
    public static void izquierda(Programa coord[]) {
        double x, y, suma=0;
        
        System.out.println("INGRESE EL DE PASOS QUE QUIERE DESPLAZARCE"+coord[0]);
        double numero = datos.nextDouble();
        suma=suma-numero;
//        x= coord[0].getX();
//        y= coord[0].getY();
//        coord[0] = new Programa((x-numero),(y));
        System.out.println("EL PUNTO AHORA SE ENCUENTRA EN");
//        System.out.println(coord[0]);
    }

    public static void derecha(Programa coord[]) {
        double x, y;

        System.out.println("INGRESE EL DE PASOS QUE QUIERE DESPLAZARCE");
        double numero = datos.nextDouble();
//        x= coord[0].getX();
//        y=coord[0].getY();
//        coord[0] = new Programa((x+numero),(y)); 
       System.out.println("EL PUNTO AHORA SE ENCUENTRA EN");
//        System.out.println(coord[0]);
    }

    public static void arriba(Programa coord[]) {
        double x, y;

        System.out.println("INGRESE EL DE PASOS QUE QUIERE DESPLAZARCE");
        double numero = datos.nextDouble();
//        x= coord[0].getX();
//        y=coord[0].getY();
//        coord[0] = new Programa(x,(y+numero)); 
        System.out.println("EL PUNTO AHORA SE ENCUENTRA EN");
//        System.out.println(coord[0]);
    }

    public static void abajo(Programa coord[]) {
        double x, y;
        System.out.println("INGRESE EL DE PASOS QUE QUIERE DESPLAZARCE");
        double numero = datos.nextDouble();
//        x= coord[0].getX();
//        y=coord[0].getY();
//        coord[0] = new Programa((x),(y-numero));  
        System.out.println("EL PUNTO AHORA SE ENCUENTRA EN");
        System.out.println(coord[0]);
    }

    public static void distancia(Programa coord[]) {
        double x, y, distancia=0;
        System.out.println("LA DISTANCIA TOTAL QUE SE DESPLAZO EL PUNTO DESDE EL ORIGEN ES");
//        x=coord[0].getX();
//        y=coord[0].getY();
//        distancia=sqrt((x*x)+(y*y));
        System.out.println("EL PUNTO SE DESPLAZO UNA DISTANCIA DE"+distancia);
//   
    }

}
