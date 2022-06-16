public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.71;
        double weight = 77;
        double bodyMassIndex = service.calculate(height, weight);

        System.out.println("Индекс массы тела = " + bodyMassIndex + " кг/м3");
    }
}