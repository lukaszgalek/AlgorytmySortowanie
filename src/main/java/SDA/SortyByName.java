package SDA;

import java.util.Comparator;

public class SortyByName implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getNazwa().compareTo(o2.getNazwa());
    }
}
