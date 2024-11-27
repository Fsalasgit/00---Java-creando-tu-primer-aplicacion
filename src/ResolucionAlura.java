import java.util.Scanner;

public class ResolucionAlura {
    public static void main(String[] args) {
        String nombre = "Tony Stark" ;
        String tipoDeCuenta = "corriente" ;
        double saldo = 1599.99;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        String menu = """
                *** Escriba el numero de la opción deseada ***
                1 - Consultar salado
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        System.out.println("***************************");
        System.out.println("\nNombre: " + nombre);
        System.out.println("\nTipo de cuenta: " + tipoDeCuenta);
        System.out.println("\nSaldo disponible: $" + saldo + " Usd.");
        System.out.println("\n***************************");



        while(opcion != 9 ){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es: " + saldo + " Usd.");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valore que desea retirar");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= valorARetirar;
                        System.out.println("El saldo actual es: " + saldo + " Usd.");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valore que desea retirar");
                    double valorADepositar = teclado.nextDouble();

                    saldo += valorADepositar;
                    System.out.println("El saldo actual es: " + saldo + " Usd.");
                case 9:
                    System.out.println("Saliendo del programa... Gracias por utilizar nuestro servicio");
                default:
                    System.out.println("La opcion elegida no es validad, elija otra opción");

            }
        }

    }
}
