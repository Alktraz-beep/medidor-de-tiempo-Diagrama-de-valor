import java.util.Scanner;
//import java.util.*;
public class App {
    public static void esperaPunto(){
        Scanner  termina= new Scanner(System.in);
        while(termina.next().charAt(0)!='.'){
            System.out.println("para terminar de grabar el tiempo poner ''.''");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero deacuerdo al tipo de actividad que se presentara y ''.'' para cuando termine ese tiempo");
        System.out.println("\t1.Actividad de valor\n\t2.actividad\n\t3.actividad de desperdicio\n\t4.para terminar:\n");
        int eleccion;
        do{
            eleccion=input.nextInt();
            switch(eleccion){
                case 1:
                    esperaPunto();
                    break;
                case 2:
                    esperaPunto();
                    break;
                case 3:
                    esperaPunto();
                    break;
                default:
                    System.out.println("Numero no permitido, solo 1,2,3 o 4");
                    //System.exit(0);
            }
        }while(eleccion!=4);
        input.close();
    }
   
}
