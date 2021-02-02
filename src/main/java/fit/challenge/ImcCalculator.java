package fit.challenge;

public class ImcCalculator {
    private static String MAGREZA = "Magreza";
    private static String NORMAL = "Normal";
    private static String SOBREPESO = "Sobrepeso";
    private static String OBESIDADE = "Obesidade";

    public static String calculate(double weight, double height) {
        double underWeightTop = 18.5;
        double normalWeightTop = 24.9;
        double overWeightTop = 30;

        double result = weight / (height * height);

        if (result <= underWeightTop) {
            return MAGREZA;
        } else if (result > underWeightTop && result <= normalWeightTop ) {
            return NORMAL;
        } else if (result > normalWeightTop && result <= overWeightTop) {
            return SOBREPESO;
        } else {
            return OBESIDADE;
        }
    }
}