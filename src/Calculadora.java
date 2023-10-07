import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner valorTerminal = new Scanner(System.in);

        System.out.print("Primer número: ");
        double primerNum = valorTerminal.nextDouble();
        System.out.print("Segundo número: ");
        double segundoNum = valorTerminal.nextDouble();
        System.out.print("Operación: ");
        String operacion = valorTerminal.nextLine();
        valorTerminal.close();

        double resultadoOperacion = 0;
        if(operacion.equals("suma"));
        else if(operacion.equals("resta"));
        else if(operacion.equals("multiplicacion"));
        else if(operacion.equals("division"));
        else if(operacion.equals("modulo"));
        else if(operacion.equals("potencia"));
        else System.out.println("Operacion no encontrada");

        System.out.println(resultadoOperacion);
    }
}