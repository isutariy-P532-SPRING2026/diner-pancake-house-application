public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items, int dayOfWeek) {
        this.items = items;
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