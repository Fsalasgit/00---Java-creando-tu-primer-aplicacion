import java.util.Scanner;

public class desafioAppBancaria {
    public static void main(String[] args) {
        int saldo = 2000;
        Scanner inputTeclado = new Scanner(System.in);
        System.out.println("*************************\n\nNombre del cliente: Tony Stark\nTipo de cuenta:Corriente\nSaldo disponible: $2000 Usd");
        String selectMenuText = "\n*************************\n** Escribe el número de la opción deseada **\n1 - Consultar saldo\n2 - Retirar\n3 - Depositar\n9 - Salir";
        int numeroSeleccionado = 0;
        double agregandoRestando = 0;

        while (numeroSeleccionado != 9){
            System.out.println(selectMenuText);
            numeroSeleccionado = inputTeclado.nextInt();

            if(numeroSeleccionado == 1){
                System.out.println("Su saldo es: $" + saldo + " Usd.");
            } else if (numeroSeleccionado == 2) {
                System.out.println("¿Cuánto desea retirar?");
                agregandoRestando = inputTeclado.nextDouble();
                saldo -= agregandoRestando;
                System.out.println("Su saldo es: $" + saldo + " Usd.");
            } else if (numeroSeleccionado == 3) {
                System.out.println("¿Cuánto desea ingresar?");
                agregandoRestando = inputTeclado.nextDouble();
                saldo += agregandoRestando;
                System.out.println("Su saldo es: $" + saldo + " Usd.");
            } else if (numeroSeleccionado != 9 ) {
                System.out.println(numeroSeleccionado + " no es valido");

            }
        }
        System.out.println("Gracias por usar nuestro servicio");

    }
}
