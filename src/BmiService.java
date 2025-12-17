public class BmiService {
    public double calculate(int Weight, double Height) {
        double Bmi;
        Bmi = Weight / (Height * Height);
        return (int) Bmi;
    }
}
