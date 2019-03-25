package condition;
/**
 * Максимальное значение 2х чисел..
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class Max {
    public int max(int first, int second) {

        int result = first > second ? first : second;
        return result;
    }
}
