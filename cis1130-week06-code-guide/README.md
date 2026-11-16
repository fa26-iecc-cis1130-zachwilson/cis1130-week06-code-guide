# CIS 1130 Week 6 Code Guide: Objects and Classes

Example programs for Chapter 9 (Objects and Classes) and Chapter 10 (Thinking in Objects). Run them, read the comments, and change them to see what happens.

## Get the code

In JupyterHub, open a Terminal and run:

```bash
git clone https://github.com/fa26-iecc-cis1130-zachwilson/cis1130-week06-code-guide.git
cd cis1130-week06-code-guide
```

Each folder has programs made of **more than one class**. Compile all the files in a folder at once, then run the class that has `main`:

```bash
cd chapter09-objects-and-classes
javac *.java
java RectangleDemo
```

## Chapter 9: Objects and Classes

| Run this | It shows | Try this |
|----------|----------|----------|
| `RectangleDemo` (uses `Rectangle`) | Fields, two constructors, getters and setters, `this`, `toString`, a static counter, and a UML diagram in the comments | Add a `isSquare()` method that returns a boolean, and call it in `main` |
| `RosterDemo` (uses `Player`) | An array of objects, `null` elements, and finding the best average by calling a method on each object | Add a fourth player, then print the total points for the whole roster |

## Chapter 10: Thinking in Objects

| Run this | It shows | Try this |
|----------|----------|----------|
| `ReferencesDemo` (uses `Counter`) | Aliasing, `==` vs. `equals`, passing objects vs. primitives to methods, and `null` | Predict every line of output before you run it |
| `WrapperDemo` | `Integer.parseInt`, `Double.parseDouble`, `MAX_VALUE`, autoboxing, `Character` methods, and why wrappers use `equals` | Change `x` and `y` to `100` and run it again. Then look up why the result changes. |
