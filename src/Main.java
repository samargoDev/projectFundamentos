import vh.Sensor;
import static vh.Vehiculo.*;
import static vh.Sensor.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String [] args) {
        mostrarMenu();
    }

    public static void mostrarMenu(){
        Boolean bl = true;
        while(bl == true){
            String start = new String("0. Finaliza el programa \n 1. Anadir nuevo vehiculo \n 2. Informacion de todos los vehiculos almacenados hasta el momento \n 3. Cantidad de vehiculos almacenados hasta el momento \n 4. Informacion de los vehiculos que son de color verde  \n 5. Informacion de los vehiculos cuyo modelo esta entre 2000 y 2021  \n 6. Anadir nuevo sensor \n 7. Informacion de todos los sensores \n 8. Cantidad de sensores \n 9. Informacion de los sensores cuyo tipo es temperatura \n 666. Arreglo que organiza por valor de menor a mayor");
            System.out.println(start);
            Scanner mySca = new Scanner(System.in);
            int numUser = mySca.nextInt();
            switch (numUser){
                case 0:
                    System.out.println("El sistema ha finalizado");
                    bl = false;
                    break;
                case 1:
                    if(posAnadir < tamano){
                        int model = mySca.nextInt();
                        String brand = mySca.next();
                        double value = mySca.nextDouble();
                        String color = mySca.next();

                        vh.Vehiculo vehicle = new vh.Vehiculo(model, brand, value, color);

                    } else {
                        System.out.println("Error, base de datos llena");
                    }
                    break;
                case 2:
                    System.out.println("Informacion de todos los vehiculos almacenados hasta el momento");
                    System.out.println(toStringVehiculos());
                    break;
                case 3:
                    System.out.println("Cantidad de vehiculos almacenados hasta el momento");
                    System.out.println(cantidadVehiculos());
                    break;
                case 4:
                    System.out.println("Informacion de los vehiculos que son de color verde");
                    System.out.println(showColor());
                    break;
                case 5:
                    System.out.println("Informacion de los vehiculos cuyo modelo esta entre 2000 y 2021");
                    System.out.println(showModel());
                    break;
                case 6:
                    if(posAnadirS < tamanoS){
                        String type = mySca.next();
                        double value = mySca.nextDouble();
                        vh.Sensor sensor = new Sensor(type, value);
                    } else {
                        System.out.println("Error, base de datos llena");
                    }
                    break;
                case 7:
                    System.out.println("Informacion de todos los sensores");
                    System.out.println(toStringSensores());
                    break;
                case 8:
                    System.out.println("Cantidad de sensores");
                    System.out.println(cantidadSensores());
                    break;
                case 9:
                    System.out.println("Informacion de los sensores cuyo tipo es temperatura");
                    System.out.println(showType());
                    break;
                case 666:
                    System.out.println("Arreglo que organiza por valor de menor a mayor");
                    ArrayList<Sensor> myArray = showTemp();
                    for(int i = 0; i < myArray.size(); i++){
                        System.out.println(myArray.get(i));
                    }

                    break;
                default:
                    System.out.println("Digite una opcion correcta");
                    break;
            }
        }
    }

}
