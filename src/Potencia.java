public class Potencia {
    public int sacarResultado(int numero, int exponente){
        int resultado=1;
        if(exponente>0){
            for(int i=0; i<exponente; i++){
                resultado = resultado*numero;
            }
        }
        else if(exponente<0){
            //mensaje de invalido?
        }
        return resultado;
    }
}
