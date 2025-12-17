import jdk.swing.interop.LightweightContentWrapper;

public class Main {
    public static void main(String[] args) {
        BmiService Service = new BmiService();
        double Bmi = Service.calculate(82, 1.79);
        System.out.println("Индекс массы тела равен: " + (Bmi));
    }
}
