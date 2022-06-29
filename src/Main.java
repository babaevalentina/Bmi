public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float height = 1.6f;
        int weight = 65;

        float index = service.calculate(height, weight);
        System.out.println("Индекс - " + index);
    }
}
