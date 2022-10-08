import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

//Los lavadores.com - Tarea1

public class Lavadores {

//Se crearon los ArrayList.

static ArrayList<String> nombre = new ArrayList<String>();
static ArrayList<String> edad = new ArrayList<String>();
static ArrayList<String> identificacion = new ArrayList<String>();
static ArrayList<String> fechaNacimiento = new ArrayList<String>();
static ArrayList<String> direccion = new ArrayList<String>();
static ArrayList<Integer> saldo = new ArrayList<Integer>();
static ArrayList<Integer> numeroCuenta = new ArrayList<Integer>();
static int numClientes = 0;

static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
static PrintStream out = System.out;



//Registrar clientes

public static void registrarCliente(ArrayList<String> nombre, ArrayList<String> edad, ArrayList<String> fechaNacimiento, ArrayList<String> direccion, ArrayList<String> identificacion) throws IOException {
 

    out.println("Ingrese la cantidad de clientes que desea registrar. No puede registrar identificaciones repetidas.");
    numClientes = Integer.parseInt(System.console().readLine());    
         for (int i = 0; i < numClientes; i++) {

            //Comprueba que la identificacion no se encuentre dentro del array.
           out.println("Ingrese su identificación");
           String idRepetido = System.console().readLine();
           boolean repetido = identificacion.contains(idRepetido);
           
           if (repetido) {
            out.println("Ingreso una identificacion repetida. Se le devolvera al menu los cambios en este cliente no seran guardados. ");
            i=numClientes+1;

          } else {

            identificacion.add(idRepetido);
            out.println("Ingrese su nombre ");
            nombre.add(in.readLine());
            out.println("Ingrese su edad");
            edad.add(in.readLine());
            out.println("Ingrese su fecha de nacimiento");
            fechaNacimiento.add(in.readLine());
           out.println("Ingrese su direccion");
           direccion.add(in.readLine());
        }

    }
    
    

}





//Listar clientes

public static void listarCliente(ArrayList<String> nombre, ArrayList<String> edad, ArrayList<String> fechaNacimiento, ArrayList<String> direccion, ArrayList<String> identificacion) throws IOException {
    out.println("A continuación se presentaran los datos de los clientes registrados actualmente.");
    
    for (int i = 0; i < numClientes; i++) {
        out.println("El numero del cliente es: " + i + "\n El nombre del cliente es: " +nombre.get(i) + " \n La edad del cliente es: " +edad.get(i) + " \n La fecha de nacimiento del cliente es: " +fechaNacimiento.get(i) + " \n La identificación del cliente es: " +identificacion.get(i) + " \n La direccion del cliente es: " +direccion.get(i));
    }
    
    }
//Crear cuenta

public static void crearCuenta(ArrayList<Integer> numeroCuenta, ArrayList<Integer> saldo){

    out.println("Ingrese la cantidad de cuentas que desea registrar.");
    numClientes = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < numClientes; i++) {

out.println("Ingrese el numero de cuenta que desea asignar. Debe de tener 7 digitos.");

           int numeroRepetido = Integer.parseInt(System.console().readLine());
           boolean repetido = numeroCuenta.contains(numeroRepetido);
           if (repetido) {
            out.println("Ingreso un numero de cuenta repetido. Se le devolvera al menu los cambios en esta cuenta no seran guardados. ");
            i=numClientes+1;

          } else {

        numeroCuenta.add(numeroRepetido);

//Calculo para saber la cantidad de digitos que posee el numero que puso el usuario.
int x =numeroCuenta.get(0);
int digitos = 0;
while (x != 0) {
    x = x / 10;
    ++digitos;
}

//Comprueba si la cantidad de digitos es valida, sino le dara un mensaje de error.

if (digitos == 7) {

 out.println("Por favor, digite cuanto quiere depositar debe de ser igual o mayor a 50 000 colones.");
 saldo.add(Integer.parseInt(System.console().readLine()));

if (saldo.get(i) >= 50000) {
    out.println("Se ha realizado la transferencia exitosamente. \n Su cuenta ha sido creada con exito.");

} else {
    out.println("Ha digitado un valor menor a 50000 se le devolvera al menu. Los cambios en esta cuenta no se guardaran.");
    saldo.remove(i);
    numeroCuenta.remove(i);
    i=numClientes+1;

}

} else {
    out.println("Ha digitado un valor no valido, se le devolvera al menu.");
    saldo.remove(i);
    numeroCuenta.remove(i);
    i=numClientes+1;
}

    }
}

    }



//Realizar deposito
public static void deposito (ArrayList<Integer> saldo, ArrayList<Integer> numeroCuenta){
    out.println("Digite el numero de cuenta al cual desea depositarle.");
    int x=Integer.parseInt(System.console().readLine());
    //Localiza el indice en base al elemento (numero de cuenta)
    int y= numeroCuenta.indexOf(x);
    out.println("Digite la cantidad que desea depositar.");
    //Calculos del nuevo salario.
    int depositoCantidad=Integer.parseInt(System.console().readLine());

    if (depositoCantidad>0) {
    int salarioAnterior=saldo.get(y);
    int nuevoSaldo = salarioAnterior + depositoCantidad;
    //Se reemplaza el anterior elemento por uno nuevo.
    saldo.set(y,nuevoSaldo);
    out.println("Su nuevo saldo es: " +saldo.get(y));
    } else {
        out.println("No se pueden realizar depositos que son 0 o menos. Se le devolvera al menú");

    }

}


//Realizar retiro

public static void retiro (ArrayList<Integer> saldo, ArrayList<Integer> numeroCuenta){
out.println("Digite el numero de cuenta al cual desea retirarle.");
    int x=Integer.parseInt(System.console().readLine());
    saldo.indexOf(x);
    //Localiza el indice en base al elemento (numero de cuenta)
    int y= numeroCuenta.indexOf(x);
    out.println("Digite la cantidad que desea retirar.");
    int retiroCantidad=Integer.parseInt(System.console().readLine());

    if (retiroCantidad>0) {
    int salarioAnterior=saldo.get(y);
    int nuevoSaldo = salarioAnterior - retiroCantidad;
    //Se reemplaza el anterior elemento por uno nuevo.
    saldo.set(y,nuevoSaldo);
    out.println("Su nuevo saldo es: " +saldo.get(y));
    } else {
        out.println("No se pueden realizar retiros que son 0 o menos. Se le devolvera al menú.");

    }
}
//Mostrar saldo

public static void mostrarSaldo(ArrayList<Integer> saldo,  ArrayList<Integer> numeroCuenta) throws IOException {

    out.println("Digite su numero de cuenta");
    int x=Integer.parseInt(System.console().readLine());
    int y= numeroCuenta.indexOf(x);
      //Localiza el indice en base al elemento (numero de cuenta)
    if (saldo.get(y)<=0) {

        out.println("Cuenta no tiene fondos.");
 
    } else {
    out.println("Su saldo actual es de: " + saldo.get(y) + " colones.");

    }
}
//Menu

public static void menu() throws NumberFormatException, IOException {

    char continuar = 's'; // inicio while
    while (continuar == 's' || continuar == 'S') {

        out.println(
                " Ingrese Un Numero Del 1 al 8 para elegir una opción \n 1) Registrar clientes \n 2) Listar clientes. \n 3) Crear cuenta.  \n 4) Realizar deposito. \n 5) Realizar retiro. \n 6) Mostrar saldo de cuenta \n 7) Salir\n");
        int o = Integer.parseInt(in.readLine());
        switch (o) {

            case 1: {

                registrarCliente(nombre, edad, fechaNacimiento, direccion, identificacion);

                break;
            }

            case 2: {

                listarCliente(nombre, edad, fechaNacimiento, direccion, identificacion);;
              
                break;
            }

            case 3: {

                crearCuenta(numeroCuenta, saldo);
              

                break;
            }

            case 4: {

              deposito(saldo, numeroCuenta);

                break;
            }
            case 5: {

           retiro(saldo, numeroCuenta);

                break;
            }

            case 6: {
                
                mostrarSaldo(saldo, numeroCuenta);

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