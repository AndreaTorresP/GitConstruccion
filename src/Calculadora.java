import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner numeroTerminal = new Scanner(System.in);
        Scanner operacionTerminal = new Scanner(System.in);

        System.out.print("Primer número: ");
        double primerNum = numeroTerminal.nextDouble();
        System.out.print("Segundo número: ");
        double segundoNum = numeroTerminal.nextDouble();
        System.out.print("Operación: ");
        String operacion = operacionTerminal.nextLine();
        numeroTerminal.close();
        operacionTerminal.close();

        double resultadoOperacion = 0;
        if(operacion.equals("suma"));
        else if(operacion.equals("resta"));
        else if(operacion.equals("multiplicacion"));
        else if(operacion.equals("division")){
            resultadoOperacion = calcularDivision(primerNum, segundoNum);
        }
        else if(operacion.equals("modulo"));
        else if(operacion.equals("potencia"));
        else System.out.println("Operacion no encontrada");

        System.out.println(resultadoOperacion);
    }

    public static double calcularDivision(double divisor, double dividendo){
        double resultadoDivision;
       if(dividendo>0){
            resultadoDivision = divisor/dividendo;
            return resultadoDivision;
       }
       return 0;
}
}