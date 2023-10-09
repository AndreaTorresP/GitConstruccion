import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner valorTerminal = new Scanner(System.in);

        try{
            System.out.print("Primer número: ");
            double primerNum = valorTerminal.nextDouble();
        
            System.out.print("Segundo número: ");
            double segundoNum = valorTerminal.nextDouble();
        
            mostrarMenu();
            int operacion = valorTerminal.nextInt();
            Operacion tipoOperacion = Operacion.values()[operacion-1];
            valorTerminal.close();

            double resultadoOperacion = 0;
            switch (tipoOperacion) {
                case Op_SUMA:
                    //funcion suma
                    break;
                case Op_RESTA: 
                    //funcion resta
                    break;
                case Op_MULTIPLICACION:
                    //funcion multiplicacion
                    break;
                case Op_DIVISION:
                    //funcion division
                    break;
                case Op_MODULO:
                    resultadoOperacion = modulo(primerNum, segundoNum);
                    break;
                case Op_POTENCIA:  
                    //funcion potencia
                    break;
            }
            System.out.println(resultadoOperacion);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Operacion no encontrada.");
        }
        catch(Exception e){
            System.out.println("Tus datos deben ser números.");
        }
    }

    public static void mostrarMenu(){
            System.out.println("Numero de la Operación: ");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Módulo");
            System.out.println("6.- Potencia");
    }

    public static double modulo(double dividendo, double divisor) {
        // El módulo solamente acepta enteros, por lo que se hace casting
        int intDividendo = (int) dividendo;
        int intDivisor = (int) divisor;
        double valorResiduo;

        try {
            valorResiduo = intDividendo % intDivisor;
        } catch (Exception e) {
            System.out.println("El divisor no puede ser " + intDivisor);
            valorResiduo = 0;
        }
        return valorResiduo;
    }
}