public class BmiService {
    public float calculate(float height, int weight) {

        float result = weight / (height * height);
        System.out.println(result);
        return result;
    }
}