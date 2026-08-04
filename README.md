# Java Task Manager

A lightweight, console-based to-do list application written in Java. It lets you manage a simple in-memory task list through an interactive menu.

## Features

- **Add tasks** — Enter a task description and add it to the list.
- **View tasks** — Display all currently saved tasks, or a helpful message when the list is empty.
- **Remove tasks** — Remove a task by entering its position in the list (starting at `1`).
- **Exit safely** — End the application from the menu and close the input scanner.

## Prerequisites

- Java Development Kit (JDK) installed and available on your terminal path.

## How to Run

From the project directory, compile the source file:

```bash
javac mainProject.java
```

Then start the application:

```bash
java mainProject
```

## Lesson Learned: `Scanner.nextInt()` and the Input Buffer

When a user enters a menu option such as `1` and presses Enter, the input buffer receives both the number and the newline character (`\n`).

`sc.nextInt()` reads only the numeric value, leaving that newline behind. If the program then immediately calls `sc.nextLine()` to read a task description, it consumes the leftover newline straight away. The result is an empty string and the user's task input appears to be skipped.

The standalone `sc.nextLine()` immediately after `sc.nextInt()` fixes this by consuming the pending newline. The next call to `sc.nextLine()` can then wait for and read the user's actual task text.
