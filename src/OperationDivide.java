public class OperationDivide {

    private int local_divider;
    private int local_dividend;


    public void makeDivision(int input_Divider,int input_Dividend){

        try {

            local_divider = input_Divider;
            local_dividend = input_Dividend;
            int divideResult;

            if(local_dividend == 0){
                throw new DividendZeroException();
            }

            divideResult = (local_divider/local_dividend);
            System.out.println("The result is: " + divideResult);

        } catch (Exception DividendZeroException) {
            System.out.println(" Dividend value should be higher than 0 ");
        }
    }
}
