# Part 8 - Composite Pattern  (with DessertMenu as child of DinerMenu) amd vegetarian of all

## The Tree Structure

  OBJECTVILLE RESTAURANTS  (root Menu)
  |
  |-- PANCAKE HOUSE MENU   (Menu)
  
  |     |-- K&B's Pancake Breakfast   (MenuItem)
  
  |     |-- Regular Pancake Breakfast (MenuItem)
  
  |     |-- Blueberry Pancakes        (MenuItem)
  
  |     |-- Waffles                   (MenuItem)
  
  |
  
  |-- DINER MENU           (Menu)
  
  |     |-- Vegetarian BLT            (MenuItem)
  
  |     |-- BLT                       (MenuItem)
  
  |     |-- Soup of the Day           (MenuItem)
  
  |     |-- Hot Dog                   (MenuItem)
  
  |     |-- Steamed Veggies           (MenuItem)
  
  |     |-- Pasta                     (MenuItem)
  
  |     |-- DESSERT MENU              (Menu - child of Diner!)
  
  |           |-- Apple Pie           (MenuItem)
  
  |           |-- Chocolate Brownie   (MenuItem)
  
  |           |-- Cheesecake          (MenuItem)
  
  |           |-- Sorbet              (MenuItem)
  
  |
  
  |-- CAFE MENU            (Menu)
  
  |      
  
  |     |-- Burger                    (MenuItem)
  
  |     |-- Veggie Burger             (MenuItem)
  
  |     |-- Fries                     (MenuItem)
  
  |     |-- Soup of the Day           (MenuItem)
  
  |     |-- Club Sandwich             (MenuItem)

## Vegetarian filter

  When user selects option 2, the app walks the entire tree and prints
  only items where isVegetarian() returns true, including desserts.

## How to run

  javac *.java
  
  java MenuTestDrive
