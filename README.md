# Part 4 - Adding CafeMenu with Iterator Pattern

## What this does

A third restaurant (Cafe) is added using a HashMap to store menu items.
Thanks to the Iterator pattern, the Waitress prints all three menus
using the exact same loop — no changes needed to the core logic.

## Structure

- `MenuItem.java`                 — Holds name, description, vegetarian flag, price
- `Iterator.java`                 — Custom Iterator interface (hasNext, next)
- `DinerMenuIterator.java`        — Iterator for Array (Diner)
- `PancakeHouseMenuIterator.java` — Iterator for ArrayList (Pancake House)
- `CafeMenuIterator.java`         — Iterator for HashMap (Cafe) ← NEW
- `DinerMenu.java`                — Lunch menu stored in an Array
- `PancakeHouseMenu.java`         — Breakfast menu stored in an ArrayList
- `CafeMenu.java`                 — Cafe menu stored in a HashMap ← NEW
- `Waitress.java`                 — Updated to include CafeMenu
- `MenuTestDrive.java`            — Interactive console app

## Three different data structures, one loop:

  DinerMenu        → Array       → DinerMenuIterator
  PancakeHouseMenu → ArrayList   → PancakeHouseMenuIterator
  CafeMenu         → HashMap     → CafeMenuIterator
  All handled by → printMenu(Iterator iterator)

## How to run

javac *.java

java MenuTestDrive
