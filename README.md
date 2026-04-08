# Part 5 - Alternating Menus with Day Selection

## What this does

All three restaurants alternate their menu items by day of the week.
On startup the app shows the current date, day, and today's items automatically.
Users can also browse the menu for any specific day of the week.

## Alternating Schedule (applies to all 3 restaurants)

  Mon / Wed / Fri / Sun  ->  items at positions 1, 3, 5  (index 0, 2, 4)
  Tue / Thu / Sat        ->  items at positions 2, 4, 6  (index 1, 3, 5)

## What displays on startup

- Current date and day (e.g. Date: 2026-04-08 | Day: Wednesday)
- Which schedule is active (Mon/Wed/Fri/Sun or Tue/Thu/Sat)
- Today's alternating items for all 3 restaurants
- Date and day banner repeated after the menu

## Files

New files:

- DayChecker.java                     Shared day-of-week logic, date label
- AlternatingDinerMenuIterator.java   Alternating iterator for Array
- AlternatingPancakeMenuIterator.java Alternating iterator for ArrayList
- AlternatingCafeMenuIterator.java    Alternating iterator for HashMap

Updated files:

- DinerMenu.java        Added createAlternatingIterator(int dayOfWeek)
- PancakeHouseMenu.java Added createAlternatingIterator(int dayOfWeek)
- CafeMenu.java         Added createAlternatingIterator(int dayOfWeek)
- Waitress.java         Added printTodaysMenus() and printMenuForDay()
- MenuTestDrive.java    Date banner, interactive menu with day picker

## Interactive Menu Options

1 - Today's alternating menu (all restaurants)
2 - Pick any day (Mon-Sun) and see its menu
3 - Full menu all restaurants
4 - Full Diner menu
5 - Full Pancake House menu
6 - Full Cafe menu
9 - Vegetarian items only
0 - Exit

## Sample output on startup

  ==========================================

    Date: 2026-04-08 | Day: Wednesday | Mon/Wed/Fri/Sun schedule - showing items 1, 3, 5

  ==========================================

  === PANCAKE HOUSE - Today's Breakfast ===

    [V] K&B's Pancake Breakfast         $2.99
    [V] Blueberry Pancakes              $3.49

  === DINER - Today's Lunch ===

    [V] Vegetarian BLT                  $2.99
        Soup of the Day                 $3.29
    [V] Steamed Veggies and Brown Rice  $3.99

  === CAFE - Today's Items ===

  ==========================================

    Date: 2026-04-08 | Day: Wednesday | Mon/Wed/Fri/Sun schedule - showing items 1, 3, 5

  ==========================================

## How to run

  javac *.java
  
  java MenuTestDrive
