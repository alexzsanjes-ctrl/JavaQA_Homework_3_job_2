import jdk.swing.interop.LightweightContentWrapper;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(82, 1.79);
        System.out.println("Индекс массы тела равен: " + (bmi));
    }
}
