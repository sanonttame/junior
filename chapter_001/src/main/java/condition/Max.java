package condition;
/**
 * Максимальное значение 3х чисел..
 * @author Anton Narayan
 * @version 0.2
 * @since 0.1
 */
public class Max {
    public int max(int first, int second) {

        return first > second ? first : second;
    }
    public int max(int first, int second, int third) {
        if (first > second && first > third){
            return first;
        }
        else if (first < second && second > third){
            return second;
        }
        else return third;
    }
}
