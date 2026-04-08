import java.util.HashMap;

public class CafeMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public CafeMenuIterator(HashMap<String, MenuItem> map) {
        items = map.values().toArray(new MenuItem[0]);
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    public MenuItem next() {
        return items[position++];
    }
}