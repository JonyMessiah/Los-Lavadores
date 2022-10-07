import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;


public class Lavadores {

//Se crearon los ArrayList.

ArrayList<String> nombre = new ArrayList<String>();
ArrayList<String> edad = new ArrayList<String>();
ArrayList<String> identificacion = new ArrayList<String>();
ArrayList<String> fechaNacimiento = new ArrayList<String>();
ArrayList<String> direccion = new ArrayList<String>();
ArrayList<Integer> saldo = new ArrayList<Integer>();
static int numClientes = 0;



static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
static PrintStream out = System.out;

//Los lavadores.com - Tarea1



//Registrar clientes

public static void registrarCliente(ArrayList<String> nombre, ArrayList<String> edad, ArrayList<String> fechaNacimiento, ArrayList<String> direccion, ArrayList<String> identificacion) throws IOException {

    out.println("Ingrese la cantidad de clientes que desea registrar.");
    int numClientes = Integer.parseInt(System.console().readLine());

    
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

public static void listarCliente(ArrayList<String> nombre, ArrayList<String> edad, ArrayList<String> fechaNacimiento, ArrayList<String> direccion, ArrayList<String> identificacion, int numClientes) throws IOException {
    out.println("A continuación se presentaran los datos de los clientes registrados actualmente.");
    
    for (int i = 0; i < numClientes; i++) {
        out.println("El nombre del cliente es: " +nombre.get(i) + " \n La edad del cliente es: " +edad.get(i) + " \n La fecha de nacimiento del cliente es: " +fechaNacimiento.get(i) + " \n La identificación del cliente es: " +identificacion.get(i) + " \n La direccion del cliente es: " +direccion.get(i));
    }
    
    }
//Crear cuenta

//Realizar deposito

//Realizar retiro

//Mostrar saldo

}