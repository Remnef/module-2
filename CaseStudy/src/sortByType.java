import java.util.Comparator;

public class sortByType implements Comparator<Drink> {
    @Override
    public int compare(Drink o1, Drink o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
