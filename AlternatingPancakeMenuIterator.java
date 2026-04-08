import java.util.ArrayList;

public class AlternatingPancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position;

    public AlternatingPancakeMenuIterator(ArrayList<MenuItem> items, int dayOfWeek) {
        this.items = items;
        position = DayChecker.isAlternateDay(dayOfWeek) ? 1 : 0;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position += 2;
        return item;
    }
}