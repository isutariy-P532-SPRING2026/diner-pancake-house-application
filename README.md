# Part 3 - Iterator Pattern ← MAIN BRANCH

## What this does

Applies the Iterator design pattern so the Waitress uses ONE loop
for both menus, regardless of how they store their items internally.

## Structure

- `MenuItem.java`              — Holds name, description, vegetarian flag, price
- `Iterator.java`              — Custom Iterator interface (hasNext, next)
- `DinerMenuIterator.java`     — Iterator for the Array-based Diner menu
- `PancakeHouseMenuIterator.java` — Iterator for the ArrayList-based Pancake menu
- `DinerMenu.java`             — Lunch menu, returns a DinerMenuIterator
- `PancakeHouseMenu.java`      — Breakfast menu, returns a PancakeHouseMenuIterator
- `Waitress.java`              — Uses Iterator, one loop works for both menus
- `MenuTestDrive.java`         — Runs the app

## What the Iterator Pattern solves

Before (Part 2): Waitress needed two separate loops and knew
the internal structure of each menu (Array vs ArrayList).

After (Part 3): Waitress only talks to the Iterator interface.
It does not know or care if the menu uses an Array or ArrayList.
Adding a new restaurant only requires a new Iterator class.

## How to run

javac *.java

java MenuTestDrive
