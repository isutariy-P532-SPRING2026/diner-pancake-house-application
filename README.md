# Part 1 - Two Separate Menus

## What this does

Two separate restaurant menus that each print themselves independently.

## Structure

- `MenuItem.java`        — Holds name, description, vegetarian flag, price
- `DinerMenu.java`       — Lunch menu, stores items in an **Array**
- `PancakeHouseMenu.java`— Breakfast menu, stores items in an **ArrayList**
- `MenuTestDrive.java`   — Runs the app

## The Problem with this approach

Each menu prints itself using a different kind of loop:

- DinerMenu uses `for (int i = 0; i < numberOfItems; i++)`
- PancakeHouseMenu uses `for (int i = 0; i < items.size(); i++)`

There is no single place that combines or controls both menus.
This is what Part 2 fixes.

## How to run

javac *.java
java MenuTestDrive
