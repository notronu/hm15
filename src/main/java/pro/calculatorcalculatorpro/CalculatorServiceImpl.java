package pro.calculatorcalculatorpro;

public class CalculatorServiceImpl implements Service{
    @Override
    public int sum( int num1, int num2){
        return num1 + num2;
    }
    public int substract( int num1, int num2){
        return num1 - num2;
    }
    public int multiply( int num1, int num2){
        return num1 * num2;
    }
    public int divide( int num1, int num2){
        return num1 / num2;
    }
}
