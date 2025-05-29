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
                double saldoCuenta = 0;
                System.out.println("Seleccione una opción: \n1 - Consultar Saldo\n2 - Retirar Dinero\n3 - Depositar Dinero\n4 - Transferir Dinero\n5 - Cerrar Sesión");
                int opcion = sc.nextInt();
            } else {
                System.out.println("Usuario y/o contraseña incorrectos");
                intentos++;
            }
        }
        System.out.println("Ha alacanzado el número máximo de intentos. Contactar al administrador.");
    }
}
