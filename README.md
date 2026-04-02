# Part 2 - Combined Menus via Waitress

## What this does

A `Waitress` class now controls both menus and prints them together.

## Structure

- `MenuItem.java`        — Holds name, description, vegetarian flag, price
- `DinerMenu.java`       — Lunch menu stored in an **Array**
- `PancakeHouseMenu.java`— Breakfast menu stored in an **ArrayList**
- `Waitress.java`        — Combines both menus and prints them
- `MenuTestDrive.java`   — Runs the app

## The Problem with this approach

The Waitress still needs TWO separate loops:

- One loop for the Array (DinerMenu)
- One loop for the ArrayList (PancakeHouseMenu)

If we added a third restaurant, we'd need a third loop.
The Waitress is forced to know about the internal structure of each menu.
This is what Part 3 (Iterator Pattern) fixes.

## How to run

javac *.java

java MenuTestDrive
