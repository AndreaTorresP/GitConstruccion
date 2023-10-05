public class DividendZeroException extends Exception {
    
    public DividendZeroException() {
        super("El valor numérico no puede ser igual a cero.");
    }
}