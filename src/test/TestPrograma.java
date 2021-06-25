package test;

import dominio.Programa;
import static java.lang.Math.sqrt;
import java.util.Scanner;
 
public class TestPrograma {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        Programa[] coordenadas = new Programa[1];
        movimientoPunto(coordenadas);
    }
    

    public static void movimientoPunto(Programa est[]) {
        double ejenx=0,ejeny=0, valorx=0, valory=0;
        System.out.println("----  EL PLANO CARTECIANO ---- ");
        System.out.println("TENEMOS UN PLANO (X;Y), "
                + "USTED PUEDE MOVERSE LAS UNIDADES QUE DESEE PERO EL PROGRAMA DECIDE LA DIRECCION ");
        System.out.println("INGRESE EL NUMERO DE MOVIMIENTOS QUE DESEEA REALIZAR");
        int n = datos.nextInt();
        est[0]=new Programa (valorx,valory);
        for (int i = 0; i < n; i++){
            int valorDado = (int) Math.floor(Math.random() * 3);
            if (valorDado == 0) {
                datos.nextLine();
                System.out.println("\n\n\n MOVIMIVIEMTO N°"+(i+1)+"\nEL PROGRAMA DECIDIO MOVERSE A LA IZQUIERDA (EJE X NEGATIVO) DEL PLANO");
                System.out.println("INDIQUE CUANTO DESEA MOVERSE");
                valorx = datos.nextDouble();
                ejenx=ejenx-valorx;
                est[0]= new Programa (ejenx,ejeny);
                System.out.println("\nEL PUNTO AHORA SE ENCUENTRA EN LA POSICION :");
                System.out.println("(X;Y) = ( " + est[0]+" )");
                System.out.println("EL PUNTO SE ENCUENTRA A "+sqrt((est[0].getEjex()*est[0].getEjex())+(est[0].getEjey()*est[0].getEjey()))+" UNIDADES RESPECTO AL ORIGEN");
                System.out.println("-------------------------------------- ");
            }
            if (valorDado == 1) {

                System.out.println("\n\n\n MOVIMIVIEMTO N°"+(i+1)+"\nEL PROGRAMA DECIDIO MOVERSE A LA DERECHA (EJE X POSITIVO) DEL PLANO");
                System.out.println("INDIQUE CUANTO DESEA MOVERSE");
                valorx = datos.nextDouble();
                ejenx=ejenx+valorx;
                est[0]= new Programa (ejenx,ejeny);
                System.out.println("\nEL PUNTO AHORA SE ENCUENTRA EN LA POSICION :");
                System.out.println("(X;Y) = ( " + est[0]+" )");
                System.out.println("EL PUNTO SE ENCUENTRA A "+sqrt((est[0].getEjex()*est[0].getEjex())+(est[0].getEjey()*est[0].getEjey()))+" UNIDADES RESPECTO AL ORIGEN");
                System.out.println("-------------------------------------- ");
            }
            if (valorDado == 2) {
                System.out.println("\n\n\n MOVIMIVIEMTO N°"+(i+1)+"\nEL PROGRAMA DECIDIO MOVERSE A LA ARRIBA (EJE Y POSITIVO) DEL PLANO");
                System.out.println("INDIQUE CUANTO DESEA MOVERSE");
                valory = datos.nextDouble();
                ejeny=ejeny+valory;
                est[0]= new Programa (ejenx,ejeny);
                System.out.println("\nEL PUNTO AHORA SE ENCUENTRA EN LA POSICION :");
                System.out.println("(X;Y) = ( " + est[0]+" )");
                System.out.println("EL PUNTO SE ENCUENTRA A "+sqrt((est[0].getEjex()*est[0].getEjex())+(est[0].getEjey()*est[0].getEjey()))+" UNIDADES RESPECTO AL ORIGEN");
                System.out.println("-------------------------------------- ");
            }
            if (valorDado == 3) {
                System.out.println("\n\n\n MOVIMIVIEMTO N°"+(i+1)+"\nEL PROGRAMA DECIDIO MOVERSE A LA ABAJO (EJE Y NEGATIVO) DEL PLANO");
                System.out.println("INDIQUE CUANTO DESEA MOVERSE");
                valory = datos.nextDouble();
                ejeny=ejeny-valory;
                est[0]= new Programa (ejenx,ejeny);
               System.out.println("\nEL PUNTO AHORA SE ENCUENTRA EN LA POSICION :");
                System.out.println("(X;Y) = ( " + est[0]+" )");
                System.out.println("EL PUNTO SE ENCUENTRA A "+sqrt((est[0].getEjex()*est[0].getEjex())+(est[0].getEjey()*est[0].getEjey()))+" UNIDADES RESPECTO AL ORIGEN");
                System.out.println("-------------------------------------- ");
            }

        }
    }
}
