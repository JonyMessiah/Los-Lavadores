import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;


public class Lavadores {

//Se crearon los ArrayList.

static ArrayList<String> nombre = new ArrayList<String>();
static ArrayList<String> edad = new ArrayList<String>();
static ArrayList<String> identificacion = new ArrayList<String>();
static ArrayList<String> fechaNacimiento = new ArrayList<String>();
static ArrayList<String> direccion = new ArrayList<String>();
static ArrayList<Integer> saldo = new ArrayList<Integer>();
static int numClientes = 0;

 //ListarClientes-CorrecionEnArrays


static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
static PrintStream out = System.out;

//Los lavadores.com - Tarea1



//Registrar clientes

public static void registrarCliente(ArrayList<String> nombre, ArrayList<String> edad, ArrayList<String> fechaNacimiento, ArrayList<String> direccion, ArrayList<String> identificacion) throws IOException {
 

    out.println("Ingrese la cantidad de clientes que desea registrar.");
    numClientes = Integer.parseInt(System.console().readLine());

    
    for (int i = 0; i < numClientes; i++) {


out.println("Ingrese su nombre ");
 nombre.add(in.readLine());
 out.println("Ingrese su edad");
 edad.add(in.readLine());
 out.println("Ingrese su fecha de nacimiento");
 fechaNacimiento.add(in.readLine());
 out.println("Ingrese su identificación");
identificacion.add(in.readLine());
out.println("Ingrese su direccion");
direccion.add(in.readLine());

out.println("¡Felicidades! Su usuario ha sido creado");

    }

}

//Listar clientes

public static void listarCliente(ArrayList<String> nombre, ArrayList<String> edad, ArrayList<String> fechaNacimiento, ArrayList<String> direccion, ArrayList<String> identificacion) throws IOException {
    out.println("A continuación se presentaran los datos de los clientes registrados actualmente.");
    
    for (int i = 0; i < numClientes; i++) {
        out.println("El numero del cliente es: " + i + "el nombre del cliente es: " +nombre.get(i) + " \n La edad del cliente es: " +edad.get(i) + " \n La fecha de nacimiento del cliente es: " +fechaNacimiento.get(i) + " \n La identificación del cliente es: " +identificacion.get(i) + " \n La direccion del cliente es: " +direccion.get(i));
    }
    
    }
//Crear cuenta

//Realizar deposito

//Realizar retiro

//Mostrar saldo

//Menu

public static void menu() throws NumberFormatException, IOException {

    char continuar = 's'; // inicio while
    while (continuar == 's' || continuar == 'S') {

        out.println(
                " Ingrese Un Numero Del 1 al 8 para elegir una opción \n 1) Registrar clientes \n 2) Listar clientes. \n 3) Crear cuenta.  \n 4) Realizar deposito. \n 5) Realizar retiro. \n 6) Mostrar saldo de cuenta \n 7) Salir\n");
        int o = Integer.parseInt(in.readLine());
        switch (o) {

            case 1: {

                registrarCliente(nombre, identificacion, fechaNacimiento, direccion, identificacion);

                break;
            }

            case 2: {

                listarCliente(nombre, identificacion, fechaNacimiento, direccion, identificacion);
              
                break;
            }

            case 3: {

              

                break;
            }

            case 4: {

              

                break;
            }
            case 5: {

           

                break;
            }

            case 6: {
                

                break;
            } 

            case 7: {
                out.println(
                        "Usted ha finalizado con este proceso, ¿desea reiniciarlo? \n s) continuar \n n) salir");
                continuar = in.readLine().charAt(0);

            }

            }

        }

}
public static void main(String[] args) throws NumberFormatException, IOException
{
    menu();
}

}