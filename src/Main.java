public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.71;
        double weight =77;
        double bmi = service.calculate(height, weight);

        System.out.println(bmi +" кг/м3");
    }
}