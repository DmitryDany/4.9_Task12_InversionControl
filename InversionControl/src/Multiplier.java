public class Multiplier implements Operation{
    @Override
    public double getResult(double a, double b){
        return a*b;
    }
    public String getText(String c){
        return "Результат умножения a и b: ";
    }
}
