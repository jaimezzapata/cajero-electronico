import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        while (intentos < 3) {
            System.out.print("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.print("ingrese su contrasena: ");
            String contrasena = sc.nextLine();
            if (usuario.equals("admin") && contrasena.equals("1234")) {
                System.out.println(usuario + ". Bienvenido al Cajero electrónico");
                double saldoCuenta = 11000;
                double valorRetiro = 0;
                int transacciones = 0;
                int opcion = 0;
                do {
                    System.out.println(
                            "Seleccione una opción: \n1 - Consultar Saldo\n2 - Retirar Dinero\n3 - Transferir Dinero\n4 - Depositar Dinero\n5 - Cerrar Sesión");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo es: " + saldoCuenta);
                            transacciones++;
                            break;
                        case 2:
                            System.out.print("Ingrese el valor a retirar: ");
                            valorRetiro = sc.nextDouble();
                            if (valorRetiro >= saldoCuenta) {
                                System.out
                                        .println("El valor " + valorRetiro + " supera el valor que tiene en la cuenta");
                            } else {
                                if (saldoCuenta - valorRetiro < 10000) {
                                    System.out.println("La cuenta no puede tener menos de 10000");
                                } else {
                                    saldoCuenta -= valorRetiro;
                                    System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldoCuenta);
                                    transacciones++;
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Ingrese el valor a transferir: ");
                            valorRetiro = sc.nextDouble();
                            System.out.println("Ingrese el número de cuenta al que desea transferir: ");
                            if (valorRetiro >= saldoCuenta) {
                                System.out
                                        .println("El valor " + valorRetiro + " supera el valor que tiene en la cuenta");
                            } else {
                                if (saldoCuenta - valorRetiro < 10000) {
                                    System.out.println("La cuenta no puede tener menos de 10000");
                                } else {
                                    saldoCuenta -= valorRetiro;
                                    System.out.println("Tranferencia exitosa. Su nuevo saldo es: " + saldoCuenta);
                                    transacciones++;
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Ingrese el valor a consignar: ");
                            double valorConsignacion = sc.nextDouble();
                            if (valorConsignacion < 0) {
                                System.out.println("No puede ingresar valores negativos");
                            } else if (valorConsignacion < 10000) {
                                System.out.println("El valor minimo a depositar es 10000");
                            } else if (valorConsignacion > 1000000) {
                                System.out.println("El valor a despositar no puede ser superior a 1000000");
                            } else {
                                saldoCuenta += valorConsignacion;
                                System.out.println("Consignación exitosa. Su nuevo saldo es: " + saldoCuenta);
                                transacciones++;
                            }
                            break;
                        case 5:
                            System.out.println("Cerrando sesión...");
                            intentos = 3;
                            break;
                    }
                } while (opcion != 5);
                System.out.println("El día de hoy se hicieron " + transacciones
                        + " transacciones. Gracias por usar el cajero electrónico.");
            } else {
                System.out.println("Usuario y/o contraseña incorrectos");
                intentos++;
            }
        }
        System.out.println("Ha alacanzado el número máximo de intentos. Contactar al administrador.");
    }
}
