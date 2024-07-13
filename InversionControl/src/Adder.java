public class Adder implements Operation{
    @Override
    public double getResult(double a, double b){
        return a+b;
    }
    public String getText(String c){
        return "Результат сложения a и b: ";
    }
}
