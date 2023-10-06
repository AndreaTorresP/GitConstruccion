import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner valorTerminal = new Scanner(System.in);

        System.out.print("Primer número: ");
        int primerNum = valorTerminal.nextInt();
        System.out.print("Segundo número: ");
        int segundoNum = valorTerminal.nextInt();
        System.out.print("Operación: ");
        String operacion = valorTerminal.nextLine();
        valorTerminal.close();

        float resultadoOperacion = 0;
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