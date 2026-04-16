# Part 9 – Composite Iterator Pattern

## Overview

Extends Part 8 (Composite Pattern) by introducing a **Composite Iterator**
to traverse the entire menu tree and filter vegetarian items,
replacing the earlier recursive `printVegetarian()` method in `Menu`.

## Design Pattern

**Composite Iterator** — an `Iterator` that uses a `Stack` to perform
a depth-first traversal over a composite tree of `Menu` and `MenuItem` nodes.

- `CompositeIterator` — walks the whole tree using a `Stack<Iterator<MenuComponent>>`
- `NullIterator` — returned by leaf nodes (`MenuItem`), has no children to iterate

## Tree Structure

```
OBJECTVILLE RESTAURANTS        (root Menu)
│
├── PANCAKE HOUSE MENU         (Menu)
│     ├── K&B's Pancake Breakfast     (MenuItem)
│     ├── Regular Pancake Breakfast   (MenuItem)
│     ├── Blueberry Pancakes          (MenuItem)
│     └── Waffles                     (MenuItem)
│
├── DINER MENU                 (Menu)
│     ├── Vegetarian BLT              (MenuItem)
│     ├── BLT                         (MenuItem)
│     ├── Soup of the Day             (MenuItem)
│     ├── Hot Dog                     (MenuItem)
│     ├── Steamed Veggies             (MenuItem)
│     ├── Pasta                       (MenuItem)
│     └── DESSERT MENU               (Menu – child of Diner)
│           ├── Apple Pie             (MenuItem)
│           ├── Chocolate Brownie     (MenuItem)
│           ├── Cheesecake            (MenuItem)
│           └── Sorbet                (MenuItem)
│
└── CAFE MENU                  (Menu)
      ├── Burger                      (MenuItem)
      ├── Veggie Burger               (MenuItem)
      ├── Fries                       (MenuItem)
      ├── Soup of the Day             (MenuItem)
      └── Club Sandwich               (MenuItem)
```

## Files

| File | Role |
|---|---|
| `MenuComponent.java` | Abstract base — declares `createIterator()` |
| `MenuItem.java` | Leaf node — returns `NullIterator` |
| `Menu.java` | Composite node — returns `CompositeIterator` over its children |
| `CompositeIterator.java` | Depth-first tree iterator using a `Stack` |
| `NullIterator.java` | No-op iterator for leaf nodes |
| `Waitress.java` | Uses `CompositeIterator` to print vegetarian items |
| `MenuTestDrive.java` | Entry point — builds the tree and runs the menu loop |
| `PancakeHouseMenu.java` | Breakfast menu items |
| `DinerMenu.java` | Lunch menu items, contains `DessertMenu` as child |
| `DessertMenu.java` | Dessert items, nested inside `DinerMenu` |
| `CafeMenu.java` | Dinner menu items |

## How to Run

```bash
javac *.java
java MenuTestDrive
```

## Menu Options

```
1. Print ALL menus       — calls allMenus.print() recursively
2. Print VEGETARIAN only — uses CompositeIterator, filters isVegetarian()
0. Exit
```
