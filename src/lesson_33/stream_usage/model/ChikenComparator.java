package lesson_33.stream_usage.model;

import java.util.Comparator;

public class ChikenComparator implements Comparator<Chiken> {
    @Override
    public int compare(Chiken o1, Chiken o2) {
        return o1.getWeight()-o2.getWeight();
    }
}
