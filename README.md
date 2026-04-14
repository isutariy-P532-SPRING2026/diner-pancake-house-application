# Part 7 - Full Composite Pattern with Dessert Submenu

## What this does
**
Completes the Composite Pattern. DinerMenu now has a DessertMenu
as a child — a menu inside a menu. Printing the DinerMenu
automatically prints its desserts too, recursively.

## The Composite Tree

  ALL MENUS  (root)
  |
  +-- PANCAKE HOUSE  (Menu/composite)
  |     +-- K&B's Pancake Breakfast  (MenuItem/leaf)
  |     +-- Regular Pancake Breakfast(MenuItem/leaf)
  |     +-- Blueberry Pancakes       (MenuItem/leaf)
  |     +-- Waffles                  (MenuItem/leaf)
  |
  +-- DINER  (Menu/composite)
  |     +-- Vegetarian BLT           (MenuItem/leaf)
  |     +-- BLT                      (MenuItem/leaf)
  |     +-- Soup of the Day          (MenuItem/leaf)
  |     +-- Hot Dog                  (MenuItem/leaf)
  |     +-- Steamed Veggies          (MenuItem/leaf)
  |     +-- Pasta                    (MenuItem/leaf)
  |     +-- DESSERT MENU             (Menu/composite) <-- child menu!
  |           +-- Apple Pie          (MenuItem/leaf)
  |           +-- Chocolate Cake     (MenuItem/leaf)
  |           +-- Ice Cream          (MenuItem/leaf)
  |           +-- Cheesecake         (MenuItem/leaf)
  |
  +-- CAFE  (Menu/composite)
        +-- Burger                   (MenuItem/leaf)
        +-- Veggie Burger            (MenuItem/leaf)
        +-- Fries                    (MenuItem/leaf)
        +-- Soup of the Day          (MenuItem/leaf)
        +-- Club Sandwich            (MenuItem/leaf)

## How print() works recursively

  allMenus.print()
    -> pancakeComposite.print()  prints its items
    -> dinerComposite.print()    prints its items, then...
         -> dessertMenu.print()  prints dessert items automatically
    -> cafeComposite.print()     prints its items

## Interactive Options

  1 - Full tree (all menus + dessert submenu)
  
  2 - Diner menu (shows regular items + desserts)
  
  3 - Pancake House menu
  
  4 - Cafe menu
  
  5 - Dessert menu only
  
  6 - Pick a day for alternating menu
  
  0 - Exit

## How to run

  javac *.java

  java MenuTestDrive
