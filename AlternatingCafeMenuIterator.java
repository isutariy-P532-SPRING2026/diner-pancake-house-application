import java.util.HashMap;

public class AlternatingCafeMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public AlternatingCafeMenuIterator(HashMap<String, MenuItem> map, int dayOfWeek) {
        items = map.values().toArray(new MenuItem[0]);
        position = DayChecker.isAlternateDay(dayOfWeek) ? 1 : 0;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    public MenuItem next() {
        MenuItem item = items[position];
        position += 2;
        return item;
    }
}