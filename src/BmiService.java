public class BmiService {
    public double BmiService(double mass, double height) {
        double bmi = (mass / (height * height));
        int index = (int) bmi;

        return index;
    }
}
