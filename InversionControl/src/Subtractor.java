public class Subtractor implements Operation{
    @Override
    public double getResult(double a, double b){
        return a-b;
    }
    public String getText(String c){
        return "Результат вычитания a и b: ";
    }
}
