import java.util.Arrays;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt();
        int count = 0;
        int[] array = new int[5];
        while (count < 5) {
            if (r < 0 || r > 50) {
                r = random.nextInt();
            } else if (r > 0 && r < 50) {
                array[count] = r;
                count++;
                r = random.nextInt();
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
