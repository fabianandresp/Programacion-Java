package tarea5;

import java.util.Scanner;

public class Tarea5 {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in); 
       
       String name1;
       String lugar1 = "1.-Brasil";
       String lugar2 = "2.- Chile";
       String lugar3 = "3.- Argentina";
       String hora1 = "1.- 11:00";
       String hora2 = "2.- 13:00";
       String hora3 = "3.- 15:00";
       int eleccion;
       int eleccion2;
       int eleccion3;
       int eleccion4;
       float valor = 500; 
       
       System.out.println("Bienvenido, lo invitamos a registrarse" );
       System.out.println("Ingrese su nombre: ");
       name1 = input.next();
       System.out.println("Bienvenido " + name1);
       
       System.out.println("Tenemos estas opciones de vuelo: ");
       System.out.println(lugar1);
       System.out.println(lugar2);
       System.out.println(lugar3);
       System.out.println("¿Donde desea viajar?");
       eleccion = input.nextInt();
 
       if ( eleccion == 1){
           System.out.println("Estas son las horas disponibles para el vuelo a brasil: ");
           System.out.println(hora1);
           System.out.println(hora3);
           System.out.println("¿Que hora desea para su viaje?");
           System.out.println(" 1 , 3 ");
           eleccion2 = input.nextInt();
           if (eleccion2 == 1 ){
               System.out.println("Boleto de Avión confirmado, lo invitamos a esperar en la sala de embarque");}
               else {
                       System.out.println("Esta hora de vuelo tiene un atraso en su hora de salida");
                       System.out.println("Se ha aplicado un 25% en su tiquiete, \n Disculpe los inconvenientes causados, \n Puede pasar a sala en embarque");
                       System.out.println("El costo del boleto es: " + valor + " Dolares");
                       }   
       }
       else if( eleccion == 2) {
           System.out.println("Estas son las horas disponibles para el vuelo a Chile: ");
           System.out.println(hora2);
           System.out.println(hora3);
           System.out.println("¿Que hora desea para su viaje?");
           System.out.println(" 2 , 3 ");
           eleccion3 = input.nextInt();
                if ( eleccion3 == 2 ){
                    System.out.println("Boleta de avion confirmado, lo invitamos a esperar en la sala de embarque");
           }
                else {
                    System.out.println("Boleto de avion confirmado, lo invitamos a esperar en la sala de embarque");
           }
       }
       else {
           System.out.println("Estas son las horas disponibles para el vuelo a Argentina: ");
           System.out.println(hora1);
           System.out.println(hora2);
           System.out.println("¿Que hora desea para su viaje?");
           System.out.println(" 1 , 2 ");
           eleccion4 = input.nextInt();
           if (eleccion4 == 1){
                       System.out.println("Esta hora de vuelo tiene un atraso en su hora de salida");
                       System.out.println("Se ha aplicado un 25% en su tiquiete, \n Disculpe los inconvenientes causados, \n Puede pasar a sala en embarque");
                       System.out.println("El costo del boleto es: " + valor + " Dolares");
           }
           else {
               System.out.println("Boleto de avion confirmado, lo invitamos a esperar en la sala de embarque");     
           }
       }
         
       System.out.println("MUCHAS GRACIAS POR PREFERIRNOS, QUE DISFRUTE SU VIAJE");
                       
        for( int i=0; i<5; i++){
            for(int j = 0; j < (i+1); j++){
            System.out.print("*");    
            }
            System.out.println("*");
            
            
        }
               }
           
       }
           
       
    
    

