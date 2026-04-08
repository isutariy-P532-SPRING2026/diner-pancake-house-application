# Part 6 - Composite Pattern: MenuComponent and MenuItem

## What this does

Introduces the first half of the Composite Pattern.
MenuComponent is the abstract base class for both leaves (MenuItem)
and composites (Menu - coming in Part 7).

## New / Changed files

- MenuComponent.java   NEW - abstract base class for the composite pattern
- MenuItem.java        UPDATED - now extends MenuComponent

## Unchanged files

  Everything else stays exactly the same as Part 5.
  MenuTestDrive.java is NOT changed.

## How Composite Pattern works (so far)

  MenuComponent  <-- abstract base (defines all possible operations)
       |
  MenuItem       <-- LEAF (overrides getName, getDescription,
                           getPrice, isVegetarian, print)
       |
  Menu           <-- COMPOSITE (coming in Part 7, will override
                           add, remove, getChild, print)

## Why UnsupportedOperationException?

MenuComponent provides default implementations that throw
UnsupportedOperationException. This means:

- MenuItem does not need to implement add/remove/getChild
  (those don't make sense for a single item)
- Menu (Part 7) will not need to implement getPrice/isVegetarian
  (those don't make sense for a whole menu)

## How to run

  javac *.java

  java MenuTestDrive
