public class Divider implements Operation{
    @Override
    public double getResult(double a, double b){
        return a/b;
    }
    public String getText(String c){
        return "Результат деления a и b: ";
    }
}
